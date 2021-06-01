import java.util.ArrayList;

public class Portfolio {
    ArrayList<Project> projects = new ArrayList<Project>();

    public Portfolio() {
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(Project project) {
        this.projects.add(project);
    }

    public double getPortfolioCost() {
        return this.totalPortfolio();
    }

    private double totalPortfolio() {
        double total = 0;
        for(Project project : projects) {
            total+= project.getInitialCost();
        }
        return total;
    }

    public void showPortfolio() {
        for(Project project : projects) {
            System.out.println(project.elevatorPitch());
        }
    }
    
}
