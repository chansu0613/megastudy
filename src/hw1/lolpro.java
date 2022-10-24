package hw1;

import java.util.*;

public class lolpro {
    public static void main(String[] args) {
        HashMap myList = new HashMap();
        List toplist = new ArrayList();
        List junglelist = new ArrayList();
        List midlist = new ArrayList();
        List botlist = new ArrayList();
        List sptlist = new ArrayList();


        myList.put("top",toplist);
        myList.put("jg",junglelist);
        myList.put("mid",midlist);
        myList.put("bot",botlist);
        myList.put("spt",sptlist);

        Scanner sc = new Scanner(System.in);
        System.out.print("Champ : ");
        String champion = sc.nextLine();
        System.out.print("Position : ");
        String position = sc.nextLine();

        List list = (List) myList.get(position);
        list.add(champion);
        System.out.println(myList);

        System.out.print("Champ : ");
        champion = sc.nextLine();
        System.out.print("Position : ");
        position = sc.nextLine();

        list = (List) myList.get(position);
        list.add(champion);
        System.out.println(myList);

        System.out.print("Champ : ");
        champion = sc.nextLine();
        System.out.print("Position : ");
        position = sc.nextLine();

        list = (List) myList.get(position);
        list.add(champion);
        System.out.println(myList);

        System.out.print("Champ : ");
        champion = sc.nextLine();
        System.out.print("Position : ");
        position = sc.nextLine();

        list = (List) myList.get(position);
        list.add(champion);
        System.out.println(myList);

        System.out.print("Champ : ");
        champion = sc.nextLine();
        System.out.print("Position : ");
        position = sc.nextLine();

        list = (List) myList.get(position);
        list.add(champion);
        System.out.println(myList);
    }
}
