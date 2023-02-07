package transport;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }

    public void addCarToQueue(Transport transport){
        if (transport.checkIsTransportNeedPassDiagnostic()) {
            queue.add(transport);
        }
    }
    public void makeTechService(Queue<Transport> queue) {
        if (queue.isEmpty()) {
            System.out.println("Очередь пустая");
        } else {
            while (!queue.isEmpty()) {
                Transport actualTransport = queue.poll();
                List<Mechanic> mechanics = actualTransport.getListMechanics();
                for (Mechanic mechanic : mechanics) {
                    mechanic.doService(actualTransport);
                }
            }
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
    }
}
