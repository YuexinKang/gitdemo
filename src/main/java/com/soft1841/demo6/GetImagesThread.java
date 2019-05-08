package com.soft1841.demo6;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GetImagesThread implements Runnable {
    private JPanel rightPanel;

    public void setRightPanel(JPanel rightPanel) {
        this.rightPanel = rightPanel;
    }

    @Override
    public void run() {
        List<ImagesEntity> list=new ArrayList<>();
        list.add(new ImagesEntity("D:/download/1.jpg"));
        list.add(new ImagesEntity("D:/download/2.jpg"));
        list.add(new ImagesEntity("D:/download/3.jpg"));
        list.add(new ImagesEntity("D:/download/4.jpg"));
        for (ImagesEntity img :list
             ) {
            File file=new File(img.getPath());
            InputStream inputStream= null;
            try {
                inputStream = new FileInputStream(file);
                byte[] bytes=new byte[(int) file.length()];
                inputStream.read(bytes);
                Icon icon=new ImageIcon(bytes);
               JLabel imagesLabel=new JLabel();
               imagesLabel.setIcon(icon);
               rightPanel.add(imagesLabel);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
