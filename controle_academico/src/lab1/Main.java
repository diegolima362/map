//package lab1;
//
//import models.Aluno;
//import models.Cadeira;
//import models.Professor;
//
//public class Main {
//
//    public static void main(String[] args) {
//        final Cadeira[] cadeiras = new Cadeira[5];
//        final Professor[] professores = new Professor[4];
//        final Aluno[] alunos = new Aluno[15];
//
//        povoarCadeiras(cadeiras);
//        povoarHorarios(cadeiras);
//
//        povoarAlunos(alunos);
//        povoarProfessores(professores);
//
//        povoarCadeirasProfessores(cadeiras, professores);
//
//        povoarCadeirasAlunos(cadeiras, alunos);
//
//        System.out.println("Dados criados\n");
//
//        // Visualizacao dos dados
//
//        System.out.println("Cadeiras:");
//        for (Cadeira cadeira1 : cadeiras) {
//            System.out.println(cadeira1);
//        }
//
//        System.out.println("\nProfessores:");
//        for (Professor professor : professores) {
//            System.out.println(professor);
//        }
//
//        System.out.println("\nAlunos:");
//        for (Aluno aluno : alunos) {
//            System.out.println(aluno);
//        }
//
//        System.out.println("\nQuantidade de alunos:");
//        for (Cadeira cadeira : cadeiras) {
//            System.out.println(cadeira.getNome() + " : " + cadeira.getTotalAlunos());
//        }
//
//        System.out.println("\nQuantidade de cadeiras por professor:");
//        for (Professor professor : professores) {
//            System.out.println(professor.getNome() + " : " + professor.getTotalCadeiras());
//        }
//
//        System.out.println("\nHorario de um professor");
//        System.out.println(professores[0].getNome() + " : " + professores[0].getHorario());
//
//        System.out.println("\nHorario de um aluno");
//        System.out.println(alunos[0].getNome() + " : " + alunos[0].getHorario());
//
//        System.out.println("\nQuantidade de cadeiras de um aluno");
//        for (Aluno aluno : alunos) {
//            System.out.println(aluno.getNome() + " : " + aluno.getTotalCadeiras());
//        }
//
//        System.out.println("\nAlunos de uma cadeira");
//        for (Aluno aluno : cadeiras[0].getAlunos()) {
//            System.out.println(aluno);
//        }
//
//    }
//
//    private static void povoarCadeirasAlunos(Cadeira[] cadeiras, Aluno[] alunos) {
//        for (Cadeira cadeira : cadeiras) {
//            for (int i = 0, length = alunos.length; i < length; i++) {
//                Aluno aluno = alunos[i];
//                cadeira.addAluno(aluno);
//                aluno.addCadeira(cadeira);
//
//                // limitar alunos por cadeira
//                if (i != 0 && i % 10 == 0)
//                    break;
//            }
//        }
//    }
//
//    private static void povoarCadeirasProfessores(Cadeira[] cadeiras, Professor[] professores) {
//        for (int i = 0, length = cadeiras.length; i < length; i++) {
//            Cadeira cadeira = cadeiras[i];
//            Professor professor = professores[i % 3];
//
//            cadeira.setProfessor(professor);
//            professor.addCadeira(cadeira);
//        }
//    }
//
//    private static void povoarHorarios(Cadeira[] cadeiras) {
//        cadeiras[0].setHorario(new String[]{"Seg 07:00", "Sex 09:00"});
//        cadeiras[1].setHorario(new String[]{"Seg 09:00", "Qua 07:00"});
//        cadeiras[2].setHorario(new String[]{"Ter 07:00", "Qua 09:00"});
//        cadeiras[3].setHorario(new String[]{"Ter 09:00", "Qui 07:00"});
//        cadeiras[4].setHorario(new String[]{"Sex 07:00", "Qui 09:00"});
//    }
//
//    private static void povoarProfessores(Professor[] professores) {
//        for (int i = 0, length = professores.length; i < length; i++) {
//            professores[i] = new Professor((i + 1), "Professor " + (i + 1));
//        }
//    }
//
//    private static void povoarAlunos(Aluno[] alunos) {
//        for (int i = 0, length = alunos.length; i < length; i++) {
//            alunos[i] = new Aluno((i + 1), "Aluno " + (i + 1));
//        }
//    }
//
//    private static void povoarCadeiras(Cadeira[] cadeiras) {
//        for (int i = 0, length = cadeiras.length; i < length; i++) {
//            cadeiras[i] = new Cadeira((i + 1), "Cadeira " + (i + 1));
//        }
//    }
//}
