package co.goodagenda.domain.model.agenda;

import co.goodagenda.domain.model.contact.Contact;

import java.util.ArrayList;

/**
 * Created by Jonathan on 10/04/2017.
 */
public class Agenda {
    private ArrayList<Contact> contacts;
    private Owner owner;

    public Agenda(ArrayList<Contact> contacts, Owner owner) {
        this.contacts = contacts;
        this.owner = owner;
    }
}
