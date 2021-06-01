public class Compilador {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        Project proyecto = new Project("Proyecto 1", "Coding dojo", 200.50);
        Project communitify = new Project("Communitify", "Aministración de Condominios", 1800.50);

        // utilizando el metodo elevatorPitch que imprime el proyecto
        String proyectoUno = proyecto.elevatorPitch();
        System.out.println(proyectoUno);

        // agregando los proyectos a el arraylist portfolio
        portfolio.setProjects(proyecto);
        portfolio.setProjects(communitify);

        // total precio del portfolio
        double totalPortfolio = portfolio.getPortfolioCost();

        System.out.println("\n");
        System.out.println("Precio total del portfolio: " + totalPortfolio);
        System.out.println("\n");

        System.out.println("Todos los projectos");
        portfolio.showPortfolio();

    }

}
