package org.razertory.javacodelab.graph;

import org.razertory.javacodelab.graph.adjacency.AGraph;
import org.razertory.javacodelab.graph.matrix.MGraph;

public class GraphHelper {

    /**
     *  创建一个默认的图
     *  0 --------- 1
     *  |         / | \
     *  |       /   |  \
     *  |     /     |   2
     *  |   /       |   /
     *  | /         | /
     *  4 -------- 3
     *
     *  在以 0 为起点的情况下，
     *  BFS: 0, 1, 4, 2, 3
     *  DFS: 0, 1, 2, 3, 4
     */

    /**
     * 临接表
     * 先创建 vertex，再创建 edge
     */
    public static AGraph createAGraph() {
        AGraph agraph = new AGraph(5);
        agraph.addVertex(0);
        agraph.addVertex(1);
        agraph.addVertex(2);
        agraph.addVertex(3);
        agraph.addVertex(4);
        agraph.addEdge(0, 1);
        agraph.addEdge(0, 4);
        agraph.addEdge(1, 2);
        agraph.addEdge(1, 3);
        agraph.addEdge(1, 4);
        agraph.addEdge(3, 4);
        return agraph;
    }

    /**
     *  创建一个带权默认的图
     *  0 ----(1)----- 1
     *  |         /   | \  (2)
     *  |       /    |   \
     *  |(4)  /(4)  (3)   | 2
     *  |   /        |   /
     *  | /          | /  (2)
     *  4 ----(3)---- 3
     *
     */

    /*
     *    0  1  2  3  4
     *   ---------------
     * 0| 0  1  0  0  4
     * 1| 1  0  2  3  4
     * 2| 0  2  0  2  0
     * 3| 0  3  2  0  3
     * 4| 4  4  0  3  0
     */
    public static MGraph createMgraph() {
        MGraph mGraph = new MGraph(5);
        mGraph.addEdge(0, 1, 1);
        mGraph.addEdge(2, 3, 3);
        mGraph.addEdge(3, 4, 4);
        mGraph.addEdge(4, 0, 4);
        mGraph.addEdge(4, 2, 2);
        return mGraph;
    }
}
