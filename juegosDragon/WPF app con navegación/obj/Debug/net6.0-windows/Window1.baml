   M S B A M L   `   `   `  ����R  NWPF app con navegación, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullA%clr-namespace:WPF_app_con_navegaciónWPF_app_con_navegación  5   	   %    WPF_app_con_navegación.Window1   5   	   W SPresentationCore, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   7local%clr-namespace:WPF_app_con_navegación     5   	     � Title$  
Formulario��5   	   $	��450��6   $	��800��6)   .��5	      � 
����� � � RowDefinitions 5
   
   �� 5      $
��Auto �6   �� 5      $
��Auto �6   �� 5      $
��Auto �6   �� 5      $
��Auto �6   �� 5       � ColumnDefinitions 5   
   �� 5      $
��Auto �6   �� 5      $��* �6   .+�5   
   �� $��Nombre ��6   $
��Left=�6"   $	��Top=�6=   �� 5   
   $��	Apellidos��6   $
��Left=�6$   $��1��6?   $	��Top=�6L   �� 5   
   $��1��6   $
��Left=�6!   $��1��6<   $��Center=�6I   .��5      ��  �� Orientation$ 
Horizontal=�6   5      �� 5   
   $��	Género
��6   $
��Left=�6+   $��2��6F   $	��Top=�6S   �� 5   
   $��1��6   $��2��6%   $��0,0,0,10q�62   .+�5      �� -   5        $��Masculino
��5       d� IsThreeState$
 True��65    d� 	IsChecked$
 TrueY�6I   6Z   �� 5      -   5        $��
Femenino
��5      64   �� 5      -   5        $��	Binario
��5      63   5      �� 5    
   $;��5¿Estás de acuerdo con
 la siguiete información?
��6   $
��Left=�6]   $��3��6x   $	��Top=�6�   �� 5!   
   $��1��6   $��3��6%   $��0,0,0,10q�62   .+�5"      	� $��Si��6   $
��Left=�6'   $��Center=�6B   $
 TrueY�6]   $
 True��6n   	� 5#      $��No��6   $
��Left=�6'   	� 5$      $��Quizás��6   $
��Left=�6+   $��Center=�6F    	� 	GroupName$ Maybe��6a   $
 TrueY�6s   5%      �� 5&   
   $��1��6   $��Freddy
��6    $
��Left=�6;   $��3,3,0,0q�6V   $	��Top=�6g   �� 5'   
   $��1��6   $��Andrade Pardo

��6    $
��Left=�6G   $��3,42,0,0q�6b   $	��Top=�6t   $��2��6�   $��24��6�   $	��131��6�   5)      5*      