package br.com.b2w.apistar.exception;

public class BadRequest extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BadRequest(String msg) {
		super(msg);
	}
}
 