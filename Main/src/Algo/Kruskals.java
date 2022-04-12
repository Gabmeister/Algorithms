package Algo;
import java.util.*;  

/*
ALGORITHM DESCRIPTION -- TO BE CODED 
1)Create set E which includes all edges
2)Soft set E in ascending order of weight
3)Iterate through set E and check if adding the element creates a cycle
4)If yes: Discard element
5)If no: Add to spanning tree and move on to next element
6)End algorithm once all vertices are reached (E = (Vertices - 1))
*/
class Kruskals {
    class Edge implements Comparable<Edge>{
        int src, dest, weight;

        public int compareTo(Edge compareEdge){
        return this.weight - compareEdge.weight;
        }
    }

    
}
