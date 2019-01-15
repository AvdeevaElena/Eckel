package Chapter19.Task11;

import Chapter11.Task26.TextFile;
import Chapter16.Task12.Generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class FileInputGenerator implements Generator<VendingInput> {
    private ArrayList<String> list;
    private List<VendingInput> vendList = new ArrayList<VendingInput>();
    private Iterator<VendingInput> it;
    private Random rand = new Random();
    private Iterator<String> input = new TextFile("VendingMachineInput.txt", ";").iterator();
    // Construct List of VendingInput from appropriately formatted txt file:

    public FileInputGenerator(String fileName) throws IOException {
        list = new TextFile(fileName, ",|;|:");
        int m = list.indexOf("Money");
        int se = list.indexOf("Selection");
        int e = list.indexOf("VendingEvent");
        VendingInput vIn;
        for(String s : list) {
            int x = list.indexOf(s);
            if(m < x && x < se) {
                String[] sa = s.split("\\(|\\)");
                vIn = new MonetaryUnit(sa[0], Integer.parseInt(sa[1]));
                vendList.add(vIn);
            }
            else if(se < x && x < e) {
                String[] sa = s.split("\\(|\\)");
                vIn = new VendedItem(sa[0], Integer.parseInt(sa[1]));
                vendList.add(vIn);
            }
            else if(e < x) {
                vIn = new VendingEvent(s);
                vendList.add(vIn);
            }
        }
        it = vendList.iterator();
    }
    public VendingInput next() {
        if(list.isEmpty()) return null;
        if(it.hasNext()) {
            return it.next();
        }
        return null;
    }
    public VendingInput randomNext() {
        return vendList.get(rand.nextInt(vendList.size()));
    }
    public VendingInput textExampleNext(String fileName) {
        if(!input.hasNext()) return null;
        String s = input.next().trim();
        String s1 = s.charAt(0) + s.substring(1).toLowerCase();
        for(int i = 0; i < this.vendList.size(); i++) {
            if(vendList.get(i).name().equals(s1)) {
                return vendList.get(i);
            }
        }
        return null;
    }
}