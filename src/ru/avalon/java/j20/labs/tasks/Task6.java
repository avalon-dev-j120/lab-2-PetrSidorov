package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Country;

import java.io.*;
import static java.lang.String.valueOf;
import java.text.ParseException;
import java.util.*;


/**
 * Задание №6
 *
 * <p>Тема: "Потоковый ввод-вывод. Получение объекта на
 * основании прочитанных данных".
 */
public class Task6 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException, ParseException {
        File input = new File("assets/countries.txt");
        Collection<Country> countries = read(input);
        
        countries.forEach((c) -> {
            System.out.println(valueOf(c));
        }); /*
         * TODO(Студент): Выполнить задание №6
         *
         * 1. Реализовать метод read.
         *
         * 2. При реализации следует пользоваться классами:
         *    BufferedReader и Country.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение коллекции объектов типа {@link Country}
     * из указанного файла.
     *
     * <p>Выполняет чтение файла построчно. Преобразование
     * из текста в объект выполняется с использованием
     * метода {@code valueOf} класса {@link Country}.
     *
     * @param file файл
     * @return коллекция объектов типа {@link Country}
     * @throws IOException в случае ошибки ввода-вывода.
     */
    
    private Collection<Country> read(File file) throws IOException, ParseException {
      try (InputStream inputstream = new FileInputStream(file);
              Reader reader = new InputStreamReader(inputstream);
              BufferedReader breader = new BufferedReader(reader)){
              
                  Collection<Country> buffer = new LinkedList<>();
                  String line;
                  while ((line = breader.readLine()) != null){
                              buffer.add(Country.valueOf(line));
                      }
                  return new ArrayList<>(buffer);
                  
                  }
                 
              }
    }

