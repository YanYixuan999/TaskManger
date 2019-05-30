package sg.edu.rp.c346.taskmanger;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class TaskAdapter extends ArrayAdapter<Task> {
    private ArrayList<Task> task;
    private Context context;

    public TaskAdapter(Context context, int resource, ArrayList<Task> objects){
        super(context, resource, objects);

        task = objects;

        this.context = context;
    }

    
}
