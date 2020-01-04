package ru.avalon.java.j20.labs.models;

import java.text.ParseException;

/**
 * Модель представления о стране.
 */
public class Country {
    /**
     * Код страны.
     */
    private final String code;
    /**
     * Название страны.
     */
    private final String name;

    /**
     * Основное конструктор класса.
     *
     * @param code код страны
     * @param name название страны
     */
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Возвращает код страны.
     *
     * @return строковый код страны
     */
    public String getCode() {
        return code;
    }

    /**
     * Возвращает название страны.
     *
     * @return название страны
     */
    public String getName() {
        return name;
    }
    


    /*
     * TODO(Студент): для класса Country переопределить методы equals и hashCode
     */

    /**
     * Возвращает экземпляр страны созданный из переданного
     * текста в формате 'Код:Название'.
     *
     * @param text тектс в формате 'Код:Название'
     * @return новый экземпляр типа {@Link Country}.
     * @throws ParseException в случае, если переданная строка
     * имеет неверный формат.
     */
    public static Country valueOf(String text) throws ParseException {
        /*
         * TODO(Студент): Реализовать метод valueOf класса Country
         */
//        throw new UnsupportedOperationException("Not implemented yet!");
        
//        if (text.contains(":") || text.contains("=") ) {
            String s = null;
           if (text.contains(":")) s = ":";
           if (text.contains("=")) s = "=";
            String[] code = text.split(s, 2);
             
            return new Country(code[0], code[1]);
          
//    } 
//        else{
//       throw new IllegalArgumentException("Текст " + text + " не содержит :");     
//    }
    }
    
    
    @Override
    public boolean equals(Object obj){
    if(obj instanceof Country) {
        Country country = (Country) obj;
        if (this.code == country.code & this.name == country.name){
            return true;
        }
            return false;
    }
    return false;
    }
    
//    @Override
//    public int hashCode() {
//    char[] ch = this.code.toCharArray();
//    return(int) ch[0] + ch[1];
//}
}
