package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Oneclass {
	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String datamatricula = JOptionPane.showInputDialog("Qual a matricula?");
		String seriematriculado = JOptionPane.showInputDialog("Qual Serie?");
		String datanascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String nomeescola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String nomepai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String nomemae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String numerocpf = JOptionPane.showInputDialog("Qual o numero do cpf?");
		String registrogeral = JOptionPane.showInputDialog("Qual o RG?");
		
				
		/*new Aluno() é uma instancia (Criação de objeto)*/
		/*aluno1 é uma referencia para o objeto Aluno*/
        
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataMatricula(datamatricula);
		aluno1.setSerieMatriculado(seriematriculado);
		aluno1.setDataNascimento(datanascimento);
		aluno1.setNomeEscola(nomeescola);
		aluno1.setNomePai(nomepai);
		aluno1.setNomeMae(nomemae);
		aluno1.setNumeroCpf(numerocpf);
		aluno1.setRegistroGeral(registrogeral);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Matemática");
		disciplina1.setNota(90);
		aluno1.getDisciplinas() .add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Português");
		disciplina2.setNota(89);
		aluno1.getDisciplinas() .add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();		
		disciplina3.setDisciplina("Física");
		disciplina3.setNota(92);
		aluno1.getDisciplinas() .add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Quimíca");
		disciplina4.setNota(86);
		aluno1.getDisciplinas() .add(disciplina4);
		
		System.out.println(aluno1.toString()); /* Descrição do objeto na memória */
		System.out.println("Média das notas: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2: " + aluno1.getAlunoAprovado2());
		
		
		
	}
}
