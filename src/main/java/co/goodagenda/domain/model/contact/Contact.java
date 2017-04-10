package co.goodagenda.domain.model.contact;

/**
 * Created by Jonathan on 10/04/2017.
 */
public class Contact {
    private Email email;
    private Address address;
    private Name name;
    private int telephone, id;

    public Contact(Email email, Address address, Name name, int telephone, int id) {
        this.email = email;
        this.address = address;
        this.name = name;
        this.telephone = telephone;
        this.id = id;
    }
}
