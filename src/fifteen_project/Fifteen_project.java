
package fifteen_project;
import java.util.ArrayList;

class Bank <T> //Параметризированный тип
{
    T[] clients;
    public Bank() //Конструктор по умолчанию
    {
        
    }
    public Bank (T[] clients) //Конструктор с параметром
    {
        this.clients = clients;
    }
}



public class Fifteen_project {

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 44;
        String y = "Hello";
        ArrayList list = new ArrayList();
        list.add(x);
        list.add(y);
        int z = (int)list.get(0);
        //System.out.println(z);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        
        Bank<Integer> bank1 = new Bank(new Integer[]{1,2,3});
        Bank<String> bank2;
        bank2 = new Bank(new String[]{"1", "2", "3"});
        
     
                
    }
    
}

/*
1_InterfaceCollection
//Интерфейс Collection является базовым для всех коллекций
//Интерфейс Collection является обобщенным и расширяет интерфейс Iterable, 
//поэтому все объекты коллекций можно перебирать в цикле по типу for-each.


public interface Collection<E> {
 
  //добавляет в коллекцию объект item. 
  //При удачном добавлении возвращает true, при неудачном - false
   boolean add (E item);
 
   // удаляет все элементы из коллекции
   void clear();
 
   // возвращает true, если объект item содержится в коллекции, иначе возвращает false
   boolean contains(Object item);
 
   // возвращает true, если коллекция пуста, иначе возвращает false
   boolean isEmpty();
 
   //возвращает true, если объект item удачно удален из коллекции, иначе возвращается false   
   boolean remove(Object item);
 
   //  возвращает число элементов в коллекции
   int size();
 
   // возвращает массив, содержащий все элементы коллекции
   Object[] toArray();
 
   // возвращает итератор коллекции
   Iterator<E> iterator();
}

public interface Iterator<E>
{
Е next();
boolean hasNext();
void remove();
}


//ПРИМЕР
Collection<String> с = . . .;
Iterator<String> iter = с.iterator();
while (iter.hasNext())
{
String element = iter.next();
сделать что-нибудь с элементом element
}
Тот же самый код можно написать более компактно, организовав цикл в стиле
for each следующим образом:
for (String element : с)
{
сделать что-нибудь с элементом element
}


//Компилятор просто преобразует цикл в стиле for each в цикл с итератором.
//Цикл в стиле for each подходит для любых объектов, класс которых реализует интерфейс
Iterable со следующим единственным методом:
public interface Iterable<E>
{
Iterator<E> iterator();
}
*****************************************************************************

2_ArrayList
ArrayList имеет следующие конструкторы:

ArrayList(): создает пустой список

ArrayList(Collection <? extends E> col): создает список, в который добавляются все элементы коллекции col.

ArrayList (int capacity): создает список, который имеет начальную емкость capacity

Некоторые основные методы интерфейса List, которые часто используются в ArrayList:

void add(int index, E obj): добавляет в список по индексу index объект obj

boolean addAll(int index, Collection<? extends E> col): добавляет в список по индексу index все элементы коллекции col. Если в результате добавления список был изменен, то возвращается true, иначе возвращается false

E get(int index): возвращает объект из списка по индексу index

int indexOf(Object obj): возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1

int lastIndexOf(Object obj): возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, то возвращается -1

E remove(int index): удаляет объект из списка по индексу index, возвращая при этом удаленный объект

E set(int index, E obj): присваивает значение объекта obj элементу, который находится по индексу index

void sort(Comparator<? super E> comp): сортирует список с помощью компаратора comp

List<E> subList(int start, int end): получает набор элементов, которые находятся в списке между индексами start и end



ArrayList<String> states = new ArrayList<String>();
        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия"); // добавляем элемент по индексу 1
         
        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Дания"); // установка нового значения для 2-го объекта
         
        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){
         
            System.out.println(state);
        }
         
        if(states.contains("Германия")){
         
            System.out.println("Список содержит государство Германия");
        }
         
        // удалим несколько объектов
        states.remove("Германия");
        states.remove(0);
         
        Object[] countries = states.toArray();
        for(Object country : countries){
         
            System.out.println(country);
        }
    } 
*********************************************************************
3_LinkedList

Обобщенный класс LinkedList<E> представляет структуру данных в виде связанного списка. Он наследуется от класса AbstractSequentialList и реализует интерфейсы List, Dequeue и Queue.

Класс LinkedList имеет следующие конструкторы:

LinkedList(): создает пустой список

LinkedList(Collection<? extends E> col): создает список, в который добавляет все элементы коллекции col

LinkedList содержит ряд методов для управления элементами, среди которых можно выделить следующие:

addFirst() / offerFirst(): добавляет элемент в начало списка

addLast() / offerLast(): добавляет элемент в конец списка

removeFirst() / pollFirst(): удаляет первый элемент из начала списка

removeLast() / pollLast(): удаляет последний элемент из конца списка

getFirst() / peekFirst(): получает первый элемент

getLast() / peekLast(): получает последний элемент

import java.util.LinkedList;
 
public class CollectionApp {
 
    public static void main(String[] args) {
         
        LinkedList<String> states = new LinkedList<String>();
         
        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания"); // добавляем на последнее место
        states.addFirst("Испания"); // добавляем на первое место
        states.add(1, "Италия"); // добавляем элемент по индексу 1
       
        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания");
        for(String state : states){
         
            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Германия")){
         
            System.out.println("Список содержит государство Германия");
        }
         
        states.remove("Германия");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента
         
        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1); // удаление второго элемента
         
        for(Person p : people){
         
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
}
class Person{
     
    private String name;
    public Person(String value){
         
        name=value;
    }
    String getName(){return name;}
}

Например, добавление в самое начало списка можно сделать так: states.addFirst("Испания");, а можно сделать так: states.add(0, "Испания");

*********************************************************

4_HashSet

Обобщенный класс HashSet<E> представляет хеш-таблицу. Он наследует свой функционал от класса AbstractSet, а также реализует интерфейс Set.

Хеш-таблица представляет такую структуру данных, в которой все объекты имеют уникальный ключ или хеш-код. Данный ключ позволяет уникально идентифицировать объект в таблице.

Для создания объекта HashSet можно воспользоваться одним из следующих конструкторов:

HashSet(): создает пустой список

HashSet(Collection<? extends E> col): создает хеш-таблицу, в которую добавляет все элементы коллекции col

HashSet(int capacity): параметр capacity указывает начальную емкость таблицы, которая по умолчанию равна 16

HashSet(int capacity, float koef): параметр koef или коэффициент заполнения, значение которого должно быть в пределах от 0.0 до 1.0, указывает, насколько должна быть заполнена емкость объектами прежде чем произойдет ее расширение. Например, коэффициент 0.75 указывает, что при заполнении емкости на 3/4 произойдет ее расширение.

Класс HashSet не добавляет новых методов, реализуя лишь те, что объявлены в родительских классах и применяемых интерфейсах:

import java.util.HashSet;
 
public class CollectionApp {
 
    public static void main(String[] args) {
         
        HashSet<String> states = new HashSet<String>();
         
        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
       
        System.out.printf("В списке %d элементов \n", states.size());
         
        for(String state : states){
         
            System.out.println(state);
        }
         
        states.remove("Германия");
         
        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for(Person p : people){
         
            System.out.println(p.getName());
        }
    }
}
class Person{
     
    private String name;
    public Person(String value){
         
        name=value;
    }
    String getName(){return name;}
}
***********************************************************
5_TreeSet

Обобщенный класс TreeSet<E> представляет структуру данных в виде дерева, в котором все объекты хранятся в отсортированном виде по возрастанию. TreeSet является наследником класса AbstractSet и реализует интерфейс NavigableSet.

В классе TreeSet определены следующие конструкторы:

TreeSet(): создает пустое дерево

TreeSet(Collection<? extends E> col): создает дерево, в которое добавляет все элементы коллекции col

TreeSet(SortedSet <E> set): создает дерево, в которое добавляет все элементы сортированного набора set

TreeSet(Comparator<? super E> comparator): создает пустое дерево, где все добавляемые элементы впоследствии будут отсортированы компаратором.



public class CollectionApp {
 
    public static void main(String[] args) {
         
        TreeSet<String> states = new TreeSet<String>();
         
        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        states.add("Великобритания");
       
        System.out.printf("В списке %d элементов \n", states.size());
         
        states.remove("Германия");
        for(String state : states){
         
            System.out.println(state);
        }
    }
}



Так как TreeSet реализует интерфейс NavigableSet, а через него и SortedSet, то мы можем применить к структуре дерева различные методы:

public class CollectionApp {
 
    public static void main(String[] args) {
         
        TreeSet<String> states = new TreeSet<String>();
         
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        states.add("Великобритания");
        System.out.println(states.first()); // получим первый - самый меньший элемент
        System.out.println(states.last()); // получим последний - самый больший элемент
        // получим поднабор от одного элемента до другого
        SortedSet<String> set = states.subSet("Германия", "Франция");
        System.out.println(set);
        // элемент из набора, который больше текущего
        String greater = states.higher("Германия");
        // элемент из набора, который больше текущего
        String lower = states.lower("Германия");
        // возвращаем набор в обратном порядке
        NavigableSet<String> navSet = states.descendingSet();
        // возвращаем набор в котором все элементы меньше текущего
        SortedSet<String> setLower=states.headSet("Германия");
        // возвращаем набор в котором все элементы больше текущего
        SortedSet<String> setGreater=states.tailSet("Германия");   
    }
}

https://habrahabr.ru/post/128269/
https://habrahabr.ru/post/127864/
https://habrahabr.ru/post/128017/
https://habrahabr.ru/post/65617/
https://habrahabr.ru/post/66926/

************************************************
6.Очереди и класс ArrayDeque


Очереди представляют структуру данных, работающую по принципу FIFO (first in - first out). То есть чем раньше был добавлен элемент в коллекцию, тем раньше он из нее удаляется. Это стандартная модель однонаправленной очереди. Однако бывают и двунаправленные - то есть такие, в которых мы можем добавить элемент не только в начала, но и в конец. И соответственно удалить элемент не только из конца, но и из начала.

Особенностью классов очередей является то, что они реализуют специальные интерфейсы Queue или Deque.

Интерфейс Queue

Обобщенный интерфейс Queue<E> расширяет базовый интерфейс Collection и определяет поведение класса в качестве однонаправленной очереди. Свою функциональность он раскрывает через следующие методы:

E element(): возвращает, но не удаляет, элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

boolean offer(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false

E peek(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null

E poll(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null

E remove(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

Таким образом, у всех классов, которые реализуют данный интерфейс, будет метод offer для добвления в очередь, метод poll для извлечения элемента из головы очереди, и методы peek и element, позволяющие просто получить элемент из головы очереди.

Интерфейс Deque

Интерфейс Deque расширяет вышеописанный интерфейс Queue и определяет поведение двунаправленной очереди, которая работает как обычная однонаправленная очередь, либо как стек, действующий по принципу LIFO (последний вошел - первый вышел).

Интерфейс Deque определяет следующие методы:

void addFirst(E obj): добавляет элемент в начало очереди

void addLast(E obj): добавляет элемент obj в конец очереди

E getFirst(): возвращает без удаления элемент из головы очереди. Если очередь пуста, генерирует исключение NoSuchElementException

E getLast(): возвращает без удаления последний элемент очереди. Если очередь пуста, генерирует исключение NoSuchElementException

boolean offerFirst(E obj): добавляет элемент obj в самое начало очереди. Если элемент удачно добавлен, возвращает true, иначе - false

boolean offerLast(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false

E peekFirst(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null

E peekLast(): возвращает без удаления последний элемент очереди. Если очередь пуста, возвращает значение null

E pollFirst(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null

E pollLast(): возвращает с удалением последний элемент очереди. Если очередь пуста, возвращает значение null

E pop(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

void push(E element): добавляет элемент в самое начало очереди

E removeFirst(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

Таким образом, наличие методов pop и push позволяет классам, реализующим этот элемент, действовать в качестве стека. В тоже время имеющийся функционал также позволяет создавать двунаправленные очереди, что делает классы, применяющие данный интерфейс, довольно гибкими.

Класс ArrayDeque

В Java очереди представлены рядом классов. Одни из низ - класс ArrayDeque<E>. Этот класс представляют обобщенную двунаправленную очередь, наследуя функционал от класса AbstractCollection и применяя интерфейс Deque.

В классе ArrayDeque определены следующие конструкторы:

ArrayDeque(): создает пустую очередь

ArrayDeque(Collection<? extends E> col): создает очередь, наполненную элементами из коллекции col

ArrayDeque(int capacity): создает очередь с начальной емкостью capacity. Если мы явно не указываем начальную емкость, то емкость по умолчанию будет равна 16

Пример использования класса:

public class CollectionApp {
 
    public static void main(String[] args) {
         
        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Германия");
        states.add("Франция");
        // добавляем элемент в самое начало
        states.push("Великобритания"); 
         
        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        String sLast = states.getLast();
         
        while(states.peek()!=null){
            // извлечение c начала
            System.out.println(states.pop());
        }
        System.out.printf("Размер очереди: %d \n", states.size());
         
         
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        for(Person p : people){
         
            System.out.println(p.getName());
        }
    }
}
class Person{
     
    private String name;
    public Person(String value){
         
        name=value;
    }
    String getName(){return name;}
}
**********************************************************
7.HashMap

Отображения представляют такие наборы, в которых каждый объект представляет пару "ключ-значение". Такие коллекции облегчают поиск элемента, если нам известен ключ - уникальный идентификатор объекта.

Все классы отображений реализуют обобщенный интерфейс Map<K, V>, который определяет основную функциональность через следующие методы:

void clear(): очищает коллекцию

boolean containsKey(Object k): возвращает true, если коллекция содержит ключ k

boolean containsValue(Object v): возвращает true, если коллекция содержит значение v

Set<Map.Entry<K, V>> entrySet(): возвращает набор элементов коллекции. Все элементы представляют объект Map.Entry

boolean equals(Object obj): возвращает true, если коллекция идентична коллекции, передаваемой через параметр obj

boolean isEmpty: возвращает true, если коллекция пуста

V get(Object k): возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение null

V put(K k, V v): помещает в коллекцию новый объект с ключом k и значением v. Если в коллекции уже есть объект с подобным ключом, то он перезаписывается. После добавления возвращает предыдущее значение для ключа k, если он уже был в коллекции. Если же ключа еще не было в коллекции, то возвращается значение null

Set<K> keySet(): возвращает набор всех ключей отображения

Collection<V> values(): возвращает набор всех значений отображения

void putAll(Map<? extends K, ? extends V> map): добавляет в коллекцию все объекты из отображения map

V remove(Object k): удаляет объект с ключом k

int size(): возвращает количество элементов коллекции

Чтобы положить объект в коллекцию, используется метод put, а чтобы получить по ключу - метод get. Реализация интерфейса Map также позволяет получить наборы как ключей, так и значений. А метод entrySet() возвращает набор всех элементов в виде объектов Map.Entry<K, V>.

Обобщенный интерфейс Map.Entry<K, V> представляет объект с ключом типа K и значением типа V и определяет следующие методы:

boolean equals(Object obj): возвращает true, если объект obj, представляющий интерфейс Map.Entry, идентичен текущему

K getKey(): возвращает ключ объекта отображения

V getValue(): возвращает значение объекта отображения

Set<K> keySet(): возвращает набор всех ключей отображения

V setValue(V v): устанавливает для текущего объекта значение v

int hashCode(): возвращает хеш-код данного объекта

При переборе объектов отображения мы будем оперировать этими методами для работы с ключами и значениями объектов.

Классы отображений

Отображения в Java представлены несколькими классами. Базовым классом для всех отображений является абстрактный класс AbstractMap, который реализует большую часть методов интерфейса Map. Наиболее распространенным классом отображений является HashMap, который реализует интерфейс Map и наследуется от класса AbstractMap.

Пример использования класса:
import java.util.*;
 
public class CollectionApp {
 
    public static void main(String[] args) {
         
       Map<Integer, String> states = new HashMap<Integer, String>();
       states.put(1, "Германия");
       states.put(2, "Испания");
       states.put(4, "Франция");
       states.put(3, "Италия");
        
       // получим объект по ключу 2
       String first = states.get(2);
       System.out.println(first);
       // получим весь набор ключей
       Set<Integer> keys = states.keySet();
       // получить набор всех значений
       Collection<String> values = states.values();
       //заменить элемент
       states.replace(1, "Бельгия");
       // удаление элемента по ключу 2
       states.remove(2);
       // перебор элементов
       for(Map.Entry<Integer, String> item : states.entrySet()){
        
           System.out.printf("Ключ: %d  Значение: %s \n", item.getKey(), item.getValue());
       }
         
       Map<String, Person> people = new HashMap<String, Person>();
       people.put("1240i54", new Person("Tom"));
       people.put("1564i55", new Person("Bill"));
       people.put("4540i56", new Person("Nick"));
        
       for(Map.Entry<String, Person> item : people.entrySet()){
        
           System.out.printf("Ключ: %s  Значение: %s \n", item.getKey(), item.getValue().getName());
       }
    }
}
class Person{
     
    private String name;
    public Person(String value){
         
        name=value;
    }
    String getName(){return name;}
}

****************************************************

8.Класс TreeMap

Класс TreeMap<K, V> представляет отображение в виде дерева. Он наследуется от класса AbstractMap и реализует интерфейс NavigableMap. В отличие от коллекции TreeHash в TreeMap все объекты автоматически сортируются по возрастанию их ключей.

Класс TreeMap имеет следующие конструкторы:

TreeMap(): создает пустое отображение в виде дерева

TreeSet(Map<K, ? extends V> map): создает дерево, в которое добавляет все элементы из отображения map

TreeSet(SortedMap<K, ? extends V> smap): создает дерево, в которое добавляет все элементы из отображения smap

TreeMap(Comparator<? super K> comparator): создает пустое дерево, где все добавляемые элементы впоследствии будут отсортированы компаратором.

Используем класс в программе:
import java.util.*;
public class CollectionApp {
 
    public static void main(String[] args) {
         
       TreeMap<Integer, String> states = new TreeMap<Integer, String>();
       states.put(10, "Германия");
       states.put(2, "Испания");
       states.put(14, "Франция");
       states.put(3, "Италия");
        
       // получим объект по ключу 2
       String first = states.get(2);
       // перебор элементов
       for(Map.Entry<Integer, String> item : states.entrySet()){
        
           System.out.printf("Ключ: %d  Значение: %s \n", item.getKey(), item.getValue());
       }
       // получим весь набор ключей
       Set<Integer> keys = states.keySet();
       // получить набор всех значений
       Collection<String> values = states.values();
        
       // получаем все объекты, которые стоят после объекта с ключом 4
       Map<Integer, String> afterMap = states.tailMap(4);
        
       // получаем все объекты, которые стоят до объекта с ключом 10
       Map<Integer, String> beforeMap = states.headMap(10);
        
       // получим последний элемент дерева
       Map.Entry<Integer, String> lastItem = states.lastEntry();
        
       System.out.printf("Последний элемент имеет ключ %d значение %s \n",lastItem.getKey(), lastItem.getValue());
         
       Map<String, Person> people = new TreeMap<String, Person>();
       people.put("1240i54", new Person("Tom"));
       people.put("1564i55", new Person("Bill"));
       people.put("4540i56", new Person("Nick"));
        
       for(Map.Entry<String, Person> item : people.entrySet()){
        
           System.out.printf("Ключ: %s  Значение: %s \n", item.getKey(), item.getValue().getName());
       }
    }
}
class Person{
     
    private String name;
    public Person(String value){
         
        name=value;
    }
    String getName(){return name;}
}

*/