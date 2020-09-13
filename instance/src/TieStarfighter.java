public class TieStarfighter {
    String model;
    Integer energy;

    TieStarfighter(){
    }

    TieStarfighter(String model){
        this.model = model;
    }

    TieStarfighter(Integer energy){
        this.energy = energy;
    }

    TieStarfighter(String model, Integer energy){
        this.model = model;
        this.energy = energy;
    }

    TieStarfighter(Integer energy, String model){
        this.model = model;
        this.energy = energy;
    }

}
