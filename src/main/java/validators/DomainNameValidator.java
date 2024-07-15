package validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class DomainNameValidator extends FieldValidatorSupport{

	@Override
	public void validate(Object object) throws ValidationException {
		System.out.println("DomainNameValidator called");
		String validDomain = "gmail.com";
		String fieldName = getFieldName();
		String email = (String)getFieldValue(fieldName, object);
		
		if(!email.endsWith(validDomain))
		{
			addFieldError(email, object);
		}
	}

}
