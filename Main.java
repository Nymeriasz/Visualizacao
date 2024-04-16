package Visualização;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Casimiro reage: lancheira da nina");
        v[1] = new Video("Greg News|Motociata");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Pamella",19, "F", "pamlla");
        g[1] = new Gafanhoto("Maria", 20, "F", "mariam");

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[1], v[1]);
        vis[1].avaliar(84.2f);
        System.out.println(vis[1].toString());
    }
}
