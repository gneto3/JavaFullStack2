package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class oneclass {
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
		
		
		String d
		= JOptionPane.showInputDialog("Disciplina1?");
		String nota1 = JOptionPane.showInputDialog("Nota 1?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina2?");
		String nota2 = JOptionPane.showInputDialog("Nota 2?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina3?");
		String nota3 = JOptionPane.showInputDialog("Nota 3?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina4?");
		String nota4 = JOptionPane.showInputDialog("Nota 4?");
		
		
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
		
		aluno1.setDisciplina1("disciplina1");
		aluno1.setNota1(Double.parseDouble(nota1));
		
		aluno1.setDisciplina2("disciplina2");
		aluno1.setNota2(Double.parseDouble(nota2));
		
		aluno1.setDisciplina3("disciplina3");
		aluno1.setNota3(Double.parseDouble(nota3));
		
		aluno1.setDisciplina4("disciplina4");
		aluno1.setNota4(Double.parseDouble(nota4));
		
		
		/*System.out.println("O nome do aluno é: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data Matricula: " + aluno1.getDataMatricula());
		System.out.println("Serie: " + aluno1.getSerieMatriculado());
		System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Escola: " + aluno1.getNomeEscola());
		System.out.println("Nome do pai: " + aluno1.getNomePai());
		System.out.println("Nome da Mãe: "+ aluno1.getNomeMae());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("RG: " + aluno1.getRegistroGeral());
		
		System.out.println("Nota1: " + aluno1.getNota1());
		System.out.println("Nota2: " + aluno1.getNota2());
		System.out.println("Nota3: " + aluno1.getNota3());
		System.out.println("Nota4: " + aluno1.getNota4());*/
		
		
	/*	Aluno aluno2 = new Aluno("Teste1");
	
        Aluno aluno3 = new Aluno("Teste2");
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
		Aluno aluno6 = new Aluno("João", 26); */
	
		
		System.out.println(aluno1.toString()); /* Descrição do objeto na memória */
		System.out.println("Média das notas: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2: " + aluno1.getAlunoAprovado2());
		
		/* EQUALS E HASHCODE (Diferenciar e comparar objetos)*/
	//	Aluno aluno1 = new Aluno();
	/*	aluno1.setNome("Gabriel");
		aluno1.setNumeroCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Gabriel Neto");
		aluno2.setNumeroCpf("1234");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais.");
		}else {
			System.out.println("Alunos NÃO são iguais.");
		}*/
		
	}
}
