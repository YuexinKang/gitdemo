package Socket;

import javax.swing.*;

public class ContentAreaThread extends Thread {
    private JTextArea contentArea;
    private byte[] b;
    public void setB(byte[] b){
        this.b = b;
    }
    public ContentAreaThread(JTextArea contentArea){
        this.contentArea= contentArea;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //contentArea.removeAll();
           // contentArea.revalidate();
            //contentArea.repaint();
            //contentArea.setText(new String(b));
            contentArea.setLineWrap(true);
            contentArea.append(new String(b));
        }
    }
}
