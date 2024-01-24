public class Opettaja extends AterioivaOtus {

    public Ruoka createRuoka(){
        return new Mysli();
    };

    public Juoma createJuoma(){
        return new Vesi();
    };

}
