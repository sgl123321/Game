package com.sgl.work;

import java.awt.GridLayout;

import javax.swing.*;

//生成面板
public class Board {
	private Square[] squArr=new Square[64];
	
	public Board(){
		
		JFrame frame = new JFrame("Game");
	      // Setting the width and height of frame
	      frame.setSize(800, 800);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      /* 创建面板，这个类似于 HTML 的 div 标签
	       * 我们可以创建多个面板并在 JFrame 中指定位置
	       * 面板中我们可以添加文本字段，按钮及其他组件。
	       */
	      JPanel panel = new JPanel();    
	      // 添加面板
	      frame.add(panel);
	      /* 
	       * 调用用户定义的方法并添加组件到面板
	       */

	    placeComponents(panel);

	      // 设置界面可见
	      frame.setVisible(true); 
	}
	void placeComponents(JPanel panel){
		//声明布局
		GridLayout gl=new GridLayout(8, 8);
		panel.setLayout(gl);
		for(int i=0;i<squArr.length;i++){
			int row=i/8;
			int col=i%8;
			if(row>=5){
				if((row+col)%2!=0)
					squArr[i]=new Square(i,"WHITE");
				else{
					squArr[i]=new Square(i,"NONE");
				}
			}else{
				squArr[i]=new Square(i,"NONE");
			}
			
			panel.add(squArr[i].getBtn());
		}
		
		
		
		
	}
	
	
}
