package net.ismailtosun.Webpage_Spring.interfaces;

import net.ismailtosun.Webpage_Spring.models.AllData;
import net.ismailtosun.Webpage_Spring.models.ContactForm;

public interface WebpageAdapter {

    public String getFire();

    public AllData getAllData(String lang);

    public ContactForm saveContactForm(ContactForm contactForm);
}
