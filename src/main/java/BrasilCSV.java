
public class BrasilCSV{
	private String Number;
	private String Gender;
	private String NameSet;
	private String Title;
	private String GivenName;
	private String SurName;
	private String StreetAddres;
	private String City;
	private String State;
	private String ZipCode;
	private String CountryFull;
	private String EmailAddress;
	private String Username;
	private String Password;
	private String TelephoneNumber;
	private String Birthday;
	private String CCType;
	private String CCNumber;
	private String CVV2;
	private String CCExpires;
	private String NationalID;
	private String Color;
	private String Kilograms;
	private String Cintimeters;
	private String GUID;
	public synchronized final String getNumber(){
		return Number;
	}
	public synchronized final void setNumber(String number){
		Number=number;
	}
	public synchronized final String getGender(){
		return Gender;
	}
	public synchronized final void setGender(String gender){
		Gender=gender;
	}
	public synchronized final String getNameSet(){
		return NameSet;
	}
	public synchronized final void setNameSet(String nameSet){
		NameSet=nameSet;
	}
	public synchronized final String getTitle(){
		return Title;
	}
	public synchronized final void setTitle(String title){
		Title=title;
	}
	public synchronized final String getGivenName(){
		return GivenName;
	}
	public synchronized final void setGivenName(String givenName){
		GivenName=givenName;
	}
	public synchronized final String getSurName(){
		return SurName;
	}
	public synchronized final void setSurName(String surName){
		SurName=surName;
	}
	public synchronized final String getStreetAddres(){
		return StreetAddres;
	}
	public synchronized final void setStreetAddres(String streetAddres){
		StreetAddres=streetAddres;
	}
	public synchronized final String getCity(){
		return City;
	}
	public synchronized final void setCity(String city){
		City=city;
	}
	public synchronized final String getState(){
		return State;
	}
	public synchronized final void setState(String state){
		State=state;
	}
	public synchronized final String getZipCode(){
		return ZipCode;
	}
	public synchronized final void setZipCode(String zipCode){
		ZipCode=zipCode;
	}
	public synchronized final String getCountryFull(){
		return CountryFull;
	}
	public synchronized final void setCountryFull(String countryFull){
		CountryFull=countryFull;
	}
	public synchronized final String getEmailAddress(){
		return EmailAddress;
	}
	public synchronized final void setEmailAddress(String emailAddress){
		EmailAddress=emailAddress;
	}
	public synchronized final String getUsername(){
		return Username;
	}
	public synchronized final void setUsername(String username){
		Username=username;
	}
	public synchronized final String getPassword(){
		return Password;
	}
	public synchronized final void setPassword(String password){
		Password=password;
	}
	public synchronized final String getTelephoneNumber(){
		return TelephoneNumber;
	}
	public synchronized final void setTelephoneNumber(String telephoneNumber){
		TelephoneNumber=telephoneNumber;
	}
	public synchronized final String getBirthday(){
		return Birthday;
	}
	public synchronized final void setBirthday(String birthday){
		Birthday=birthday;
	}
	public synchronized final String getCCType(){
		return CCType;
	}
	public synchronized final void setCCType(String cCType){
		CCType=cCType;
	}
	public synchronized final String getCCNumber(){
		return CCNumber;
	}
	public synchronized final void setCCNumber(String cCNumber){
		CCNumber=cCNumber;
	}
	public synchronized final String getCVV2(){
		return CVV2;
	}
	public synchronized final void setCVV2(String cVV2){
		CVV2=cVV2;
	}
	public synchronized final String getCCExpires(){
		return CCExpires;
	}
	public synchronized final void setCCExpires(String cCExpires){
		CCExpires=cCExpires;
	}
	public synchronized final String getNationalID(){
		return NationalID;
	}
	public synchronized final void setNationalID(String nationalID){
		NationalID=nationalID;
	}
	public synchronized final String getColor(){
		return Color;
	}
	public synchronized final void setColor(String color){
		Color=color;
	}
	public synchronized final String getKilograms(){
		return Kilograms;
	}
	public synchronized final void setKilograms(String kilograms){
		Kilograms=kilograms;
	}
	public synchronized final String getCintimeters(){
		return Cintimeters;
	}
	public synchronized final void setCintimeters(String cintimeters){
		Cintimeters=cintimeters;
	}
	public synchronized final String getGUID(){
		return GUID;
	}
	public synchronized final void setGUID(String gUID){
		GUID=gUID;
	}
	@Override
	public String toString(){
		return "Registro [Number="+Number+", Gender="+Gender+", NameSet="+NameSet+", Title="+Title+", GivenName="+GivenName+", SurName="+SurName+", StreetAddres="+StreetAddres+", City="+City+", State="+State+", ZipCode="+ZipCode+", CountryFull="+CountryFull+", EmailAddress="+EmailAddress+", Username="+Username+", Password="+Password+", TelephoneNumber="+TelephoneNumber+", Birthday="+Birthday+", CCType="+CCType+", CCNumber="+CCNumber+", CVV2="+CVV2+", CCExpires="+CCExpires+", NationalID="+NationalID+", Color="+Color+", Kilograms="+Kilograms+", Cintimeters="+Cintimeters+", GUID="+GUID+"]";
	}
}