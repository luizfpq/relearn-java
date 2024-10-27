import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ex3020 {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int addresses = scan.nextInt();
        int mailingLists = scan.nextInt();

        ArrayList<ArrayList<Integer>> relations = new ArrayList<>(mailingLists);

        for (int i = 0; i < mailingLists; i++) {
            relations.add(new ArrayList<>());
        }

        for (int i = 0; i < mailingLists; i++) {
            int connections = scan.nextInt();

            for (int j = 0; j < connections; j++) {
                int address = scan.nextInt() - 1;
                relations.get(i).add(address);
            }
        }

        HashMap<Integer, Integer> mailingListVisited = new HashMap<>();
        HashSet<Integer> clientsVisited = new HashSet<>();

        int emailsSent = traverse(0, mailingLists, relations, clientsVisited, mailingListVisited);

        System.out.println(emailsSent + " " + clientsVisited.size());
    }

    private static int traverse(int node, int clients, ArrayList<ArrayList<Integer>> relations, HashSet<Integer> clientsVisited, HashMap<Integer, Integer> mailingListVisited) {
        int emailsSent = 0;
        ArrayList<Integer> nextNodes = relations.get(node);

        for (Integer nextNode : nextNodes) {
            if (nextNode >= clients) {
                clientsVisited.add(nextNode);
                emailsSent = (int) ((emailsSent + 1) % MOD);
            } else {
                if (mailingListVisited.containsKey(nextNode)) {
                    emailsSent = (int) ((emailsSent + mailingListVisited.get(nextNode)) % MOD);
                } else {
                    emailsSent = (int) ((emailsSent + traverse(nextNode, clients, relations, clientsVisited, mailingListVisited)) % MOD);
                }
            }
        }

        mailingListVisited.put(node, emailsSent);
        return emailsSent;
    }
}