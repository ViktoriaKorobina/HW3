package org.example.task2;

/**
 * Напишите обобщенный метод compareArrays(),
 * который принимает два массива и возвращает true,
 * если они одинаковые, и false в противном случае.
 * Массивы могут быть любого типа данных,
 * но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
 *
 */
public class CompareArrays {
    public <T> boolean compareArrays(T[] arr1, T[] arr2){
        boolean result = true;
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(!arr1.getClass().getName().equals(arr2.getClass().getName())){
                    result = false;
                    return result;
                }
            }
        } else {
            result = false;
            return result;
        }
        return result;

    }
}
