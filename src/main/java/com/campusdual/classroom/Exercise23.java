package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> personMap = new HashMap<>();
        Person person = new Person("John", "Smith");
        personMap.put("person", person);
        Teacher teacher = new Teacher("María", "Montessori", "Educación");
        personMap.put("teacher", teacher);
        personMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        personMap.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));
        return personMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return map.get(key);
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> person: map.entrySet()){
            person.getValue().getDetails();
        }
    }
    
}
