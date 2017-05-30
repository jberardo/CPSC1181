/**
 * Letter class.
 * Models a letter that someone can create and send to another person.
 * The letter has 3 fields:
 *   From: The person who is sending the letter.
 *   To: The person that will receive the letter.
 *   Body: The contents of the letter.
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since 2017-05-28
 */
public class Letter {
	private String from;
	private String to;
	private String body = "";
	
	/**
	 * Class constructor.
	 * @param from Name of the person who is sending the letter.
	 * @param to Name of the person that will receive the letter.
	 */
	public Letter(String from, String to) {
		this.from = from;
		this.to = to;
	}

	/**
	 * Returns the name of the person who is sending the letter.
	 * @return From. 
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Returns the name of the person who this letter is addressed to.
	 * @return To. 
	 */
	public String getTo() {
		return to;
	}
	
	/**
	 * Adds a line to the letter's body.
	 * @return Nothing.
	 */
	public void addLine(String line) {
		body = body.concat(line).concat("\n");
	}
	
	/**
	 * Returns the letter's body.
	 * @return Letter's body.
	 */
	public String getText() {
		return body;
	}
}
