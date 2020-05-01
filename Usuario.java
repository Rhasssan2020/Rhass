# Rhass
package Interface;

import Classes.Pessoa;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;



/**
 *
 * @author samsung
 */
public class Usuario extends Pessoa{
      private String Inserir1;
      private String Inserir2;
  

    public String getInserir2() {
        return Inserir2;
    }

    public void setInserir2(String Inserir2) {
        this.Inserir2 = Inserir2;
    }

    public String getInserir3() {
        return Inserir3;
    }

    public void setInserir3(String Inserir3) {
        this.Inserir3 = Inserir3;
    }
      private String Inserir3;
    
      private String Media;
      private String NomeProf;
      private String Materia;
      private String Turma;

    public String getNomeProf() {
        return NomeProf;
    }

    public void setNomeProf(String NomeProf) {
        this.NomeProf = NomeProf;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public String getMedia() {
        return Media;
    }

    public void setMedia(String Media) {
        this.Media = Media;
    }
     
      //metodos de modificaçao//
    public String getInserir() {
        return Inserir1;
    }

    public void setInserir(String Inserir) {
        this.Inserir1 = Inserir;
    }


    public void getSenha(String text) {
        
    }
   
    
public String salvar(){
        try{
       FileWriter arq = new  FileWriter ("Cadastro.txt");
          PrintWriter gravar = new   PrintWriter(arq);
  gravar.printf("----------------------------------:Cadastro:---------------------------------\n");
  gravar.printf("Nome do Pofessor:\n");
  gravar.println("Materia:\n"+this.Materia);
  gravar.printf("Turma:\n"+this.Turma);
      gravar.close();
      JOptionPane.showMessageDialog(null, "Salvo com sucesso");
              
       }catch(Exception erro){
           JOptionPane.showMessageDialog(null, "Arquivo não salvo!");
     

       }           
          return "";
          
}
}
