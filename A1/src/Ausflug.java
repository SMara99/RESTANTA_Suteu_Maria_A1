public class Ausflug {
    public int id;
    public String reiseZiel;
    public int preisProPerson;
    public int maxAnz;
    public int anz;

    //constructor
    public Ausflug(int id, String reiseZiel, int preisProPerson, int maxAnz, int anz) {
        this.id = id;
        this.reiseZiel = reiseZiel;
        this.preisProPerson = preisProPerson;
        this.maxAnz = maxAnz;
        this.anz = anz;
    }

    // get & set id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // get & set Reiseziel
    public String getReiseZiel() {
        return reiseZiel;
    }

    public void setReiseZiel(String reiseZiel) {
        this.reiseZiel = reiseZiel;
    }

    // get & set max Preis pro Person
    public int getPreisProPerson() {
        return preisProPerson;
    }

    public void setPreisProPerson(int preisProPerson) {
        this.preisProPerson = preisProPerson;
    }

    // get & set max Anzahl
    public int getMaxAnz() {
        return maxAnz;
    }

    public void setMaxAnz(int maxAnz) {
        this.maxAnz = maxAnz;
    }

    // get & set Anzahl
    public int getAnz() {
        return anz;
    }

    public void setAnz(int anz) {
        this.anz = anz;
    }

    @Override
    public String toString() {
        return "Ausflug{" +
                "id=" + id +
                ", reiseZiel='" + reiseZiel + '\'' +
                ", preisProPerson=" + preisProPerson +
                ", maxAnz=" + maxAnz +
                ", anz=" + anz +
                '}';
    }
}
