import java.util.*;

public class AntonAndPolyhedrons {//785A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        
        Map<String, Integer> facesMap = new HashMap<>();
        facesMap.put("Tetrahedron", 4);
        facesMap.put("Cube", 6);
        facesMap.put("Octahedron", 8);
        facesMap.put("Dodecahedron", 12);
        facesMap.put("Icosahedron", 20);

        long totalFaces = 0;

        for (int i = 0; i < n; i++) {
            String polyhedron = sc.nextLine();
            totalFaces += facesMap.get(polyhedron);
        }

        System.out.println(totalFaces);
        sc.close();
    }
}
