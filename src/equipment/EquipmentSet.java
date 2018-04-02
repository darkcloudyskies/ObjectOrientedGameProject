package equipment;

import java.util.ArrayList;

public class EquipmentSet
{
    private EquipmentPiece hat;
    private EquipmentPiece necklace;
    private EquipmentPiece shoulder;
    private EquipmentPiece cape;
    private EquipmentPiece torso;
    private EquipmentPiece pants;
    private EquipmentPiece belt;
    private EquipmentPiece shoes;
    private EquipmentPiece gloves;

    public ArrayList<EquipmentPiece> getAllEquipment()
    {
        ArrayList<EquipmentPiece> equipment = new ArrayList<>();

        equipment.add(hat);
        equipment.add(necklace);
        equipment.add(shoulder);
        equipment.add(cape);
        equipment.add(torso);
        equipment.add(pants);
        equipment.add(belt);
        equipment.add(shoes);
        equipment.add(gloves);

        return equipment;
    }
}
