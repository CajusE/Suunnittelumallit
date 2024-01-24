public class Rehtori extends AterioivaOtus {

    public Ruoka createRuoka(){
        return new Patonki();
    };

    public Juoma createJuoma(){
        return new Mehu();
    };

}
