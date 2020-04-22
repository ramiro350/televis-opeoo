package televis�o;

import java.util.ArrayList;

public class ControleRemoto {
	
	
	public ArrayList<Televisao> listaTVS;

    /**
     * M�todo padr�o da classe ControleRemoto
     */

    public ControleRemoto(){

        this.listaTVS = new ArrayList<>();

    }

    /**
     * M�todo get/set do listaTVS
     * @return
     */

    public ArrayList<Televisao> getListaTVS(){

        return listaTVS;

    }

    public void setListaTVS(ArrayList<Televisao> listaTVS){

        this.listaTVS = listaTVS;

    }

    /**
     * Metodo para cadastrar TV
     * @param televisao
     * @throws TVCadastradaException
     */


    public void cadastrarTV(Televisao televisao) throws TVCadastradaException{

        if (this.listaTVS.contains(televisao)){

            throw new TVCadastradaException("Essa TV j� foi cadastrada ", televisao);


        } else {

            this.listaTVS.add(televisao);

        }

    }

    /**
     * Op��es para alterar o canal da TV
     */

    public void proximoCanal(){

        this.listaTVS.forEach(televisao -> televisao.altCanal("proximo"));

    }

    public void canalAnterior(){

        this.listaTVS.forEach(televisao -> televisao.altCanal("anterior"));

    }

    /**
     * Sintoniza o canal
     * @param canal
     */

   public void sintonizar(int canal){

       this.listaTVS.forEach(televisao -> {

           try {

               televisao.sintonia(canal);

           } catch (CanalInexistenteException e) {

               System.err.println(e.getMessage());

           }

       });

   }

    /**
     * Mostra todos os canais dispon�veis
     */


    public void mostrarGrade(){

        for (Televisao televisao : listaTVS){

            televisao.mostarGrade();

        }

    }

    /**
     * Informar os dados do canal
     * @param televisao
     */

    public void informarDados(Televisao televisao){

        televisao.informarDados();

    }

    /**
     * Op��es de controlar o volume do canal
     */

    public void aumentarVol(){

        this.listaTVS.forEach(televisao -> televisao.altVolume("aumentar"));

    }

    public void diminuirVol(){

        this.listaTVS.forEach(televisao -> televisao.altVolume("diminuir"));

    }






}
