����   ? F
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Enter the size of the array: 
      java/io/PrintStream print (Ljava/lang/String;)V
     ! nextInt ()I #  Enter the elements of the array:
  % &  println
 ( ) * + , semester4/sum_Of_ElementArray printSum ([I)I
  . & / (I)V Code LineNumberTable LocalVariableTable this Lsemester4/sum_Of_ElementArray; i I arr [I sum StackMapTable main ([Ljava/lang/String;)V args [Ljava/lang/String; sc Ljava/util/Scanner; size > 8 
SourceFile sum_Of_ElementArray.java ! (           0   /     *� �    1        2        3 4   	 + ,  0   v     <=*�� *.`<�����    1          
     
 2        5 6     7 8     9 6  :   
 � �  	 ; <  0   �     F� Y� 	� L� � +� =�
N� "� $6� -+� O���� -� '� -�    1   * 
            $  -  5  ;  E  2   4  '  5 6    F = >    ; ? @   . A 6   * 7 8  :    � '  B  C  �   D    E