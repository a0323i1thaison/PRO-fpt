
package project.Reponsitory;

import java.util.ArrayList;
import java.util.List;
import project.Model.Facility;
import project.Model.House;
import project.Model.Room;
import project.Model.Villa;
import project.Reponsitory.impl.IFacilityRepo;
import project.Util.ReadAndWriterFile;

/**
 *
 * @author thais
 */
public class FacilityRepository implements IFacilityRepo<Facility> {
       List<String> stringList = ReadAndWriterFile.readFileCSV("facility.csv");
    
 @Override
    public List<Facility> getList() {
       List<String> stringList = ReadAndWriterFile.readFileCSV("facility.csv");
       List<Facility> facilityList = new ArrayList<>();
       String[] array = null;
        for (String s: stringList) {
            array = s.split(",");
            if(array[0].contains("SVVL")) {
                String idService = array[0];
                String nameService = array[1];
                float usingArea = Float.parseFloat(array[2]);
                double price = Double.parseDouble(array[3]);
                int maxPeople = Integer.parseInt(array[4]);
                String rentalType = array[5];
                String roomStandard = array[6];
                float poolArea = Float.parseFloat(array[7]);
                int quantityFloor = Integer.parseInt(array[8]);
                Facility facility = new Villa(idService, nameService, usingArea, price, maxPeople, rentalType, roomStandard, poolArea, quantityFloor);
                facilityList.add(facility);
            } else if(array[0].contains("SVHO")) {
                String idService = array[0];
                String nameService = array[1];
                float usingArea = Float.parseFloat(array[2]);
                double price = Double.parseDouble(array[3]);
                int maxPeople = Integer.parseInt(array[4]);
                String rentalType = array[5];
                String roomStandard = array[6];
                int quantityFloor = Integer.parseInt(array[7]);
                Facility facility = new House(idService, nameService, usingArea, price, maxPeople, rentalType, roomStandard, quantityFloor);
                facilityList.add(facility);
            } else {
                    String idService = array[0];
                    String nameService = array[1];
                    float usingArea = Float.parseFloat(array[2]);
                    double price = Double.parseDouble(array[3]);
                    int maxPeople = Integer.parseInt(array[4]);
                    String rentalType = array[5];
                    String freeService = array[6];
                    Facility facility = new Room(idService, nameService, usingArea, price, maxPeople, rentalType,freeService);
                    facilityList.add(facility);
            }

        }
        return facilityList;
    }

    @Override
    public void add(Facility facility) {
        List<String> stringList = new ArrayList<>();
        stringList.add(facility.getInfoToCSV());
        ReadAndWriterFile.writeToFile("facility.csv", stringList, true);
    }

    @Override
    public void edit(List<String> stringList) {

    }

    @Override
    public void delete(List<String> stringList) {

    }
    
}
