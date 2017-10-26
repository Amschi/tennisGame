public class Player {

    private Integer numero;
    private Integer pointPlayer;


    public Player(Integer numero, Integer pointPlayer) {
        this.numero = numero;
        this.pointPlayer = pointPlayer;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setPointPlayer(Integer pointPlayer) {
        this.pointPlayer = pointPlayer;
    }

    public Integer getPointPlayer() {
        return pointPlayer;
    }

}
