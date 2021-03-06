/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataAccess.EquipmentDAO;
import Logic.Equipment;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Diego
 */
public class EquipmentControl {
    
    EquipmentDAO equipmentDAO;
    
    
    public EquipmentControl(){
        equipmentDAO = new EquipmentDAO();
    }
    
    public int insertEquipment(String nameEquipment, String serieEquipment, String descriptionEquipment){
            
        Equipment equipment = new Equipment();        

        equipment.setNameEquipment(nameEquipment);
        equipment.setSerieEquipment(serieEquipment);
        equipment.setDescriptionEquipment(descriptionEquipment);

        //Se llama al dao para guardar
        System.out.println("Se insertarà un Equipo");
        
        int result = equipmentDAO.saveEquipment(equipment);

        System.out.println("Se insertò un Equipo");
        
        return result;

    }
        
    public Equipment searchEquipment(String inputValue,String typeSearch){
        //Vector v= new Vector();

        Equipment equipment = new Equipment();
        
        System.out.println("Se va a Buscar un Equipo");

        equipment = equipmentDAO.searchEquipment(inputValue, typeSearch);
      
       return equipment;       
    }
        
    public int updateEquipment(String numberEquipment,String nameEquipment, String serieEquipment, String descriptionEquipment, String stateEquipment){
            
        Equipment equipment = new Equipment();        

        equipment.setNumberEquipment(numberEquipment);
        equipment.setNameEquipment(nameEquipment);
        equipment.setSerieEquipment(serieEquipment);
        equipment.setDescriptionEquipment(descriptionEquipment);
        equipment.setStateEquipment(stateEquipment);

        //Se llama al dao para actualizar
        System.out.println("Se actualizarà un Equipo");
        
        int result = equipmentDAO.updateEquipment(equipment);

        System.out.println("Se actualizò un Equipo");
        
        return result;

    }
        
    public ArrayList<Object[]> listSearchEquipment(String inputValue, String typeSearch){
    
         ArrayList <Object[]> inventory = new ArrayList <>();
         inventory = equipmentDAO.listSearchEquipment(inputValue, typeSearch);
         
         return inventory;      
    }
    
    public ArrayList<Object[]> listEquipment(){
    
         ArrayList <Object[]> inventory = new ArrayList <>();
         inventory = equipmentDAO.listEquipment();
         
         return inventory;      
    }
    
    
}
