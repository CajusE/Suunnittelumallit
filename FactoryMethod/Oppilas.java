public class Oppilas extends AterioivaOtus {

    public Ruoka createRuoka(){
        return new Puuro();
    };

    public Juoma createJuoma(){
        return new Maito();
    };

}
