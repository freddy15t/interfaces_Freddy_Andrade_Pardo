   M S B A M L   `   `   `  ����R  NWPF app con navegación, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullA%clr-namespace:WPF_app_con_navegaciónWPF_app_con_navegación  5   	   (    "WPF_app_con_navegación.MainWindow   5   	   W SPresentationCore, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   7local%clr-namespace:WPF_app_con_navegación     5   	     � Title$  
MainWindow��5   	   $	��450��6   $	��800��6)    J� CommandBindings 5	      )  #System.Windows.Input.CommandBinding  5
   
   -   5           Command$ ApplicationCommands.New��5
      6^     5   
   -   5        $ ApplicationCommands.Close��5      6`   .��5      ]� 
�����_�$
��True��6(   .+�5   
   o� $	��Top=�6   .@�5      m� $��_File��6   .@�5      m�  m� Command$ ApplicationCommands.New��6   $	��New��6=   m� 5      -   5        $
��Open��5      6)   m� 5      $
��Save��6   �� 5      m� 5      $ ApplicationCommands.Close��6   $
��Exit��6?   5      m� 5      $��_Tools��6   .@�5      m� $��_Manage users��6    m� Icon 5      �� 5      $��/Images/user.png��6    5      m� 5      $��_Show groups��6    m� IsCheckable$
 True��61    m� 	IsChecked$
 True��6D   5      m� 5      $��_Edit��6   .@�5       m� $	��Cut��6   ${�False��6(   m� 5!      $
��Copy��6   ${�False��6)   m� 5"      $��Paste��6   5#      5$      �� 5%   
   $	��100��6   
��� E��.+�5&      �� $��ApplicationCommands.New��6   $��Cambiar��67   $��
10,10,10,0q�6I   �� 5'      $��ApplicationCommands.Close��6   $��Cerrar��69   $��
10,10,10,0q�6J   5(       � 5)   
   -   5        $��myFrame��5)      $
��Info��6     � NavigationUIVisibility$ Hidden=�6.   �� 5*   
   $��/Images/icon.png��6   $	��318��6*   $	��591��67   5,      5-      