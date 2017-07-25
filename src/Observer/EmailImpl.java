package Observer;
/*
 * 需求1： 如果是对外发送的邮件，需要在邮件的末尾增加上公司的声明： 
   本邮件仅为个人观点，并不代表公司立场
   需求2： 对邮件内容加密
 */
public class EmailImpl implements Email {
	private String content;
	@Override
	public String getContent() {
		return content;
	}
	public EmailImpl(String content){
		this.content=content;
	}
}
class CompanyEmail{
	Email email;
	public CompanyEmail(Email email){
		this.email=email;
	}
	public String getContent() {
		return email.getContent()+"本邮件仅为个人观点，并不代表公司立场";
	}
}
