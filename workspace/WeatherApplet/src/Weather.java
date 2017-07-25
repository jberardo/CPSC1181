import java.net.*;
import java.io.*;
import java.awt.*;
import java.applet.*;

public class Weather extends Applet
{
   public void init()
   {
	   setLayout(new BorderLayout());

      state = new List(4, false);
      report = new List(4, false);
      
      addItems(state, states);
      addItems(report, reports);
      state.select(0);
      report.select(0);

      Panel p = new Panel();
      p.add(state);
      p.add(report);
      add("North", p);
      weather = new TextArea(20, 80);
      weather.setFont(new Font("Courier", Font.PLAIN, 12));

      add("Center", weather);
      p = new Panel();
      p.add(new Button("Get report"));
      add("South", p);
   }
   
   public void addItems(List l, String[][] items)
   {  for (int i = 0; i < items.length; i++)
         l.addItem(items[i][0]);
   }
   
   public String getItem(List l, String[][] items)
   {  return items[l.getSelectedIndex()][1];
   }

   public boolean action(Event evt, Object arg)
   {  new Thread() 
      {  public void run() {
            getWeather(getItem(state, states), getItem(report, reports));
         }
      }.start();
      return true;
   }


   public void getWeather(String state, String report)
   {  String r = new String();
      try
      {  String script = getParameter("proxy");
         String query = "http://www.nws.noaa.gov/view/prodsByState.php?state=" + state + "&prodtype=" + report;
         //URL s = new URL(script + "?" + query);
         URL s = new URL(query);
         weather.appendText("Fetching report from " + query + "\n");
         DataInputStream in
            = new DataInputStream(s.openStream());

         boolean more = true;
         while (more)
         {  String str = in.readLine();
            System.out.println(str);
            if (str.toLowerCase().indexOf("</html>") >= 0) 
            {  more = false;
            }

            if (str != null)
               weather.appendText(removeTags(str) + "\n");
            else more = false;
         }
         in.close();
      }
      catch(IOException e)
      {  showStatus("Error " + e);
         weather.appendText("Error " + e);
      }
   }
   
   public static String removeTags(String s)
   {  while (true)
      {  int lb = s.indexOf('<');
         if (lb < 0) return s;
         int rb = s.indexOf('>', lb);
         if (rb < 0) return s;
         s = s.substring(0, lb) + " " + s.substring(rb + 1);
      }
   }

   private TextArea weather;
   private List state;
   private List report;
   
   private String[][] states =
      {  { "Alabama", "al" }, 
         { "Alaska", "ak" }, 
         { "Arizona", "az" }, 
         { "Arkansas", "ar" }, 
         { "California", "ca" }, 
         { "Colorado", "co" }, 
         { "Connecticut", "ct" }, 
         { "Delaware", "de" }, 
         { "Florida", "fl" }, 
         { "Georgia", "ga" }, 
         { "Hawaii", "hi" }, 
         { "Idaho", "id" }, 
         { "Illinois", "il" }, 
         { "Indiana", "in" }, 
         { "Iowa", "ia" }, 
         { "Kansas", "ks" }, 
         { "Kentucky", "ky" }, 
         { "Lousisiana", "la" }, 
         { "Maine", "me" }, 
         { "Maryland", "md" }, 
         { "Massachusetts", "ma" }, 
         { "Michigan", "mi" }, 
         { "Minnesota", "mn" }, 
         { "Mississippi", "ms" }, 
         { "Missouri", "mo" }, 
         { "Montana", "mt" }, 
         { "Nebraska", "ne" }, 
         { "Nevada", "nv" }, 
         { "New Hampshire", "nh" }, 
         { "New Jersey", "nj" }, 
         { "New Mexico", "nm" }, 
         { "New York", "ny" }, 
         { "North Carolina", "nc" }, 
         { "North Dakota", "nd" }, 
         { "Ohio", "oh" }, 
         { "Oklahoma", "ok" }, 
         { "Oregon", "or" }, 
         { "Pennsylvania", "pa" }, 
         { "Rhode Island", "ri" }, 
         { "South Carolina", "sc" }, 
         { "South Dakota", "sd" }, 
         { "Tennessee", "tn" }, 
         { "Texas", "tx" }, 
         { "Utah", "ut" }, 
         { "Vermont", "vt" }, 
         { "Virginia", "va" }, 
         { "Washington", "wa" }, 
         { "West Virginia", "wv" }, 
         { "Wisconsin", "wi" }, 
         { "Wyoming", "wy" }
      };
   private String[][] reports = 
      {  { "Hourly (State Weather Roundup)", "hourly" },
         { "State Forecast", "state" },
         { "Zone Forecast", "zone" },
         { "Short Term (NOWCASTS)", "shortterm" },
         { "Forecast Discussion", "discussion" },
         { "Weather Summary", "summary" },
         { "Public Information", "public" },
         { "Climate Data", "climate" },
         { "Hydrological Data", "hydro" },
         { "Watches", "watches" },
         { "Special Weather Statements", "special" },
         { "Warnings and Advisories", "allwarnings" }
      };
}
