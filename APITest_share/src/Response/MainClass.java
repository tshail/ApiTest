package Response;

public class MainClass {

	
	    private Response response;

	    private String message;

	    private String fieldErrors;

	    private String status;

	    private String errorList;

	    public Response getResponse ()
	    {
	        return response;
	    }

	    public void setResponse (Response response)
	    {
	        this.response = response;
	    }

	    public String getStatus ()
	    {
	        return status;
	    }

	    public void setStatus (String status)
	    {
	        this.status = status;
	    }

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getFieldErrors() {
			return fieldErrors;
		}

		public void setFieldErrors(String fieldErrors) {
			this.fieldErrors = fieldErrors;
		}

		public String getErrorList() {
			return errorList;
		}

		public void setErrorList(String errorList) {
			this.errorList = errorList;
		}

	   

}
