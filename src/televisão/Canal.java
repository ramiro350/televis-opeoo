package televis�o;

public class Canal {
	
	
	public int canal;
    public String nome;
    public boolean hd;


    public Canal(int canal, String nome, boolean hd){

        this.canal = canal;
        this.nome = nome;
        this.hd = hd;

    }


    /**
     * Atributos da classe canal
     * @return
     */


    /**
     * M�todo get/set do canal
     * @return
     */

    public int getCanal(){

        return canal;

    }

    public void setCanal(int canal){
        this.canal = canal;

    }

    /**
     * M�todo get/set do nome
     * @return
     */

    public String getNome(){

        return nome;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    /**
     * M�todo get/set do hd
     * @return
     */

    public boolean isHd(){

        return hd;

    }

    public void setHd(boolean hd){

        this.hd = hd;

    }


    /**
     * Construtor informacoes().
     * @return
     */

    @Override
    public String toString(){

        return "Canal " + canal + "," + nome + ", HD = " + hd;

    }




}
