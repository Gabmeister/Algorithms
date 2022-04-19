package src;
import java.util.*;  
import java.util.Scanner;
/*
Coded by Gabriel Plaza 2022
ALGORITHM DESCRIPTION 
Kruskal's Algorithms for Minimum Spanning Tree (MST) 
Time Complexity: O(ElogE), Where E == Edges
1)Create set E which includes all edges
2)Sort set E in ascending order of weight
3)Iterate through set E and check if adding the element creates a cycle
4)If yes: Discard element
5)If no: Add to spanning tree via Union() and move on to next element
5i)Union() is used to add an edge/element into the minimum spanning tree.
6)End algorithm once all vertices are reached (E = (Vertices - 1)) as MST is found
7)Return MST & Elements
*/

/* Misc - 
    Use an array for edges then use quicksort or heapsort for step 2.
    two kruskal improvements are union by rank and path compression
*/

class Kruskals {
    class edge implements Comparable<edge>{
        int weight;
        int dest;
        int source;

        public int compare(edge edgeToCompare){
            return this.weight - edgeToCompare.weight;
        }
    }
    public static void main(String[] args){
    }

}
