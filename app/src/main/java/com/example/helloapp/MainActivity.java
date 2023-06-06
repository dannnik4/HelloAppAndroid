package com.example.helloapp;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

//    private final static String TAG = "MainActivity";

//    static final String AGE_KEY = "AGE";
//    static final String ACCESS_MESSAGE="ACCESS_MESSAGE";
//
//    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
//            new ActivityResultCallback<ActivityResult>() {
//                @Override
//                public void onActivityResult(ActivityResult result) {
//
//                    TextView textView = findViewById(R.id.textView);
//                    if(result.getResultCode() == Activity.RESULT_OK){
//                        Intent intent = result.getData();
//                        String accessMessage = intent.getStringExtra(ACCESS_MESSAGE);
//                        textView.setText(accessMessage);
//                    }
//                    else{
//                        textView.setText("Ошибка доступа");
//                    }
//                }
//            });

//    EditText editText;
//    TextView textView;

//    VideoView videoPlayer;
//    MediaPlayer mPlayer;
//    Button playButton, pauseButton, stopButton;
//    SeekBar volumeControl;
//    AudioManager audioManager;

//    String name ="undefined";
//    final static String nameVariableKey = "NAME_VARIABLE";
//    TextView nameView;
//    User user = new User("undefined", 0);
//    final static String userVariableKey = "USER_VARIABLE";

//    private static final String PREFS_FILE = "Account";
//    private static final String PREF_NAME = "Name";
//    EditText nameBox;
//    SharedPreferences settings;
//    SharedPreferences.Editor prefEditor;

//    TextView settingsText;
//    boolean enabled;
//    String login;

//    private final static String FILE_NAME = "content.txt";

//    private final static String FILE_NAME = "document.txt";

//    ListView userList;
//    TextView header;
//    DatabaseHelper databaseHelper;
//    DatabaseHelper sqlHelper;
//    SQLiteDatabase db;
//    Cursor userCursor;
//    SimpleCursorAdapter userAdapter;
//    EditText userFilter;
//    ArrayAdapter<User> arrayAdapter;

//    TextView currentDateTime;
//    Calendar dateAndTime=Calendar.getInstance();

//    private ArrayAdapter<String> adapter;

//    private static final int REQUEST_CODE_READ_CONTACTS=1;
//    private static boolean READ_CONTACTS_GRANTED =false;
//
//    ArrayList<String> contacts = new ArrayList<>();
//    Button addBtn;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.provider_layout);

        // создание TextView
        //TextView textView = new TextView(this);
        // установка текста в TextView
        //textView.setText("Hello Android!");
        // установка высоты текста
        //textView.setTextSize(22);
        // установка визуального интерфейса для activity
        //setContentView(textView);


        //ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //TextView textView = new TextView(this);
        //textView.setText("Hello Android");
        //textView.setTextSize(26);

        // устанавливаем параметры размеров и расположение элемента
        //ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        // эквивалент app:layout_constraintLeft_toLeftOf="parent"
        //layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        // эквивалент app:layout_constraintTop_toTopOf="parent"
        //layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        // устанавливаем параметры для textView
        //textView.setLayoutParams(layoutParams);
        // добавляем TextView в ConstraintLayout
        //constraintLayout.addView(textView);
        //setContentView(constraintLayout);

        //ConstraintLayout constraintLayout = new ConstraintLayout(this);


        //EditText editText = new EditText(this);
        //editText.setHint("Введите Email");
        //editText.setId(View.generateViewId());

        //Button button = new Button(this);
        //button.setText("Отправить");
        //button.setId(View.generateViewId());

        //ConstraintLayout.LayoutParams editTextLayout = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //editTextLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //editTextLayout.rightToLeft = button.getId();
        //editText.setLayoutParams(editTextLayout);
        //constraintLayout.addView(editText);

        //ConstraintLayout.LayoutParams buttonLayout = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //buttonLayout.leftToRight = editText.getId();
        //buttonLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //button.setLayoutParams(buttonLayout);
        //constraintLayout.addView(button);

        //setContentView(constraintLayout);


        //setContentView(R.layout.activity_main);
        //LinearLayout linearLayout = new LinearLayout(this);
        // горизонтальная ориентация
        //linearLayout.setOrientation(LinearLayout.HORIZONTAL);

        //TextView textView = new TextView(this);
        //textView.setText("Hello");
        //textView.setTextSize(30);
        // создаем параметры позиционирования для элемента
        //LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // устанавливаем отступы
        //layoutParams.setMargins(100, 100, 0, 0);
        //textView.setLayoutParams(layoutParams);
        // добавляем элемент в LinearLayout
        //linearLayout.addView(textView);

        //setContentView(linearLayout);


        //LinearLayout linearLayout = new LinearLayout(this);
        //linearLayout.setOrientation(LinearLayout.VERTICAL);

        // первое текстовое поле
        //TextView textView1 = new TextView(this);
        //textView1.setText("Hello");
        //textView1.setTextSize(30);
        // textView1 имеет вес 3
        //linearLayout.addView(textView1, new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.MATCH_PARENT, 0, 3));

        // второе текстовое поле
        //TextView textView2 = new TextView(this);
        //textView2.setText("Android");
        //textView2.setBackgroundColor(0xFFBDBDBD);
        //textView2.setTextSize(30);
        // textView2 имеет вес 2
        //linearLayout.addView(textView2, new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.MATCH_PARENT, 0, 2));

        //setContentView(linearLayout);

        //LinearLayout linearLayout = new LinearLayout(this);
        //linearLayout.setOrientation(LinearLayout.VERTICAL);
        //LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // установка layout_gravity
        //layoutParams.gravity = Gravity.CENTER;
        // первое текстовое поле
        //TextView textView1 = new TextView(this);
        //textView1.setText("Hello");
        //textView1.setTextSize(30);
        //linearLayout.addView(textView1, layoutParams);
        //setContentView(linearLayout);


        //RelativeLayout relativeLayout = new RelativeLayout(this);

        //EditText editText = new EditText(this);
        //editText.setId(EditText.generateViewId());

        //Button button = new Button(this);
        //button.setText("Отправить");

        // устанавливаем параметры положения для EditText
        //RelativeLayout.LayoutParams editTextParams = new RelativeLayout.LayoutParams(
        //        RelativeLayout.LayoutParams.MATCH_PARENT,
        //        RelativeLayout.LayoutParams.WRAP_CONTENT
        //);
        // выравнивание по центру родительского контейнера
        //editTextParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        // добавляем в RelativeLayout
        //relativeLayout.addView(editText, editTextParams);

        // устанавливаем параметры положения для Button
        //RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
        //        RelativeLayout.LayoutParams.WRAP_CONTENT,
        //        RelativeLayout.LayoutParams.WRAP_CONTENT
        //);
        // выравнивание справа и снизу от поля EditText
        //buttonParams.addRule(RelativeLayout.BELOW, editText.getId());
        //buttonParams.addRule(RelativeLayout.ALIGN_RIGHT, editText.getId());
        // добавляем в RelativeLayout
        //relativeLayout.addView(button, buttonParams);

        //setContentView(relativeLayout);


        //TableLayout tableLayout = new TableLayout( this);

        // первая строка
        //TableRow tableRow1 = new TableRow(this);

        //TextView textView1 = new TextView(this);
        //textView1.setText("Логин");
        //tableRow1.addView(textView1, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 0.5f));

        //EditText editText1 = new EditText(this);
        //tableRow1.addView(editText1, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.0f));

        // вторая строка
        //TableRow tableRow2 = new TableRow(this);

        //TextView textView2 = new TextView(this);
        //textView2.setText("Email");
        //tableRow2.addView(textView2, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 0.5f));

        //EditText editText2 = new EditText(this);
        //tableRow2.addView(editText2, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.f));

        //tableLayout.addView(tableRow1);
        //tableLayout.addView(tableRow2);
        //setContentView(tableLayout);


        //FrameLayout frameLayout = new FrameLayout(this);
        //TextView textView = new TextView(this);
        //textView.setText("Hello World!");

        //FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams
        //        (FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        //layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.TOP;

        //textView.setLayoutParams(layoutParams);
        //textView.setTextSize(26);
        //frameLayout.addView(textView);
        //setContentView(frameLayout);


        //GridLayout gridLayout = new GridLayout( this);
        // количество строк
        //gridLayout.setRowCount(3);
        // количество столбцов
        //gridLayout.setColumnCount(3);

        //for(int i = 1; i <=9; i++){
        //    Button btn = new Button(this);
        //    btn.setText(String.valueOf(i));
        //    gridLayout.addView(btn);
        //}

        //for(int i = 1; i <=3; i++){
        //    Button btn = new Button(this);
        //    btn.setText(String.valueOf(i));
        //    gridLayout.addView(btn);
        //}

        //Button btn4 = new Button(this);
        //btn4.setText("4");
        //GridLayout.LayoutParams layoutParams4 = new GridLayout.LayoutParams();
        //layoutParams4.columnSpec = GridLayout.spec(0,2);
        //layoutParams4.width = (int) TypedValue.applyDimension(
        //        TypedValue.COMPLEX_UNIT_DIP, 180, getResources().getDisplayMetrics());
        //gridLayout.addView(btn4, layoutParams4);


        //Button btn5 = new Button(this);
        //btn5.setText("5");
        //GridLayout.LayoutParams layoutParams5 = new GridLayout.LayoutParams();
        //layoutParams5.rowSpec = GridLayout.spec(1,2);
        //layoutParams5.height = (int) TypedValue.applyDimension(
        //        TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics());
        //gridLayout.addView(btn5, layoutParams5);

        //Button btn6 = new Button(this);
        //btn6.setText("6");
        //Button btn7 = new Button(this);
        //btn7.setText("7");
        //gridLayout.addView(btn6);
        //gridLayout.addView(btn7);

        //setContentView(gridLayout);


        //ScrollView scrollView = new ScrollView(this);

        //TextView textView = new TextView(this);
        //textView.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum.");
        //textView.setLayoutParams(new ViewGroup.LayoutParams
        //        (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        //textView.setTextSize(26);
        //scrollView.addView(textView);
        //setContentView(scrollView);


        //int clicks = 0;

        //@Override
        //protected void onCreate(Bundle savedInstanceState) {
        //    super.onCreate(savedInstanceState);
        //    setContentView(R.layout.layout_include);
        //}

        //public void onClick(View view){
        //    TextView clicksText = findViewById(R.id.clicksText);
        //    clicks++;
        //    clicksText.setText(clicks + " Clicks");
        //}

        //View plusButtonView = findViewById(R.id.plus_button);
        //View minusButtonView = findViewById(R.id.minus_button);
        //TextView clicksText = findViewById(R.id.clicksText);

        //Button plusButton = plusButtonView.findViewById(R.id.clickBtn);
        //Button minusButton = minusButtonView.findViewById(R.id.clickBtn);

        //plusButton.setText("+");
        //minusButton.setText("-");

        //plusButton.setOnClickListener(v -> {
        //    clicks++;
        //    clicksText.setText(clicks + " Clicks");
        //});
        //minusButton.setOnClickListener(v -> {
        //    clicks--;
        //    clicksText.setText(clicks + " Clicks");
        //});


        //ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //TextView textView = new TextView(this);
        //textView.setText("Hello Android!");
        //textView.setTextSize(30);
        //textView.setBackgroundColor(0xffe8eaf6);

        // установка gravity
        //textView.setGravity(Gravity.BOTTOM | Gravity.CENTER);

        // установка высоты и ширины
        //ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, 200);
        //layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        //layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        //textView.setLayoutParams(layoutParams);

        //constraintLayout.addView(textView);
        //setContentView(constraintLayout);


        //ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //TextView textView = new TextView(this);
        // установка фонового цвета
        //textView.setBackgroundColor(0xffe8eaf6);
        // установка цвета текста
        //textView.setTextColor(0xff5c6bc0);
        // делаем все буквы заглавными
        //textView.setAllCaps(true);
        // устанавливаем вравнивание текста по центру
        //textView.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        // устанавливаем текста
        //textView.setText("Hello Android!");
        // установка шрифта
        //textView.setTypeface(Typeface.create("casual", Typeface.NORMAL));
        // устанавливаем высоту текста
        //textView.setTextSize(26);

        //ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //textView.setLayoutParams(layoutParams);

        //constraintLayout.addView(textView);
        //setContentView(constraintLayout);


        //EditText editText = findViewById(R.id.editText);

        //editText.addTextChangedListener(new TextWatcher() {

        //    public void afterTextChanged(Editable s) {}

        //    public void beforeTextChanged(CharSequence s, int start,
        //                                  int count, int after) {
        //    }

        //    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //        TextView textView = findViewById(R.id.textView);
        //        textView.setText(s);
        //    }
        //});

        //}
        // Обработка нажатия кнопки
        //public void sendMessage(View view) {
        //    TextView textView = findViewById(R.id.textView);
        //    EditText editText = findViewById(R.id.editText);
        //    textView.setText("Добро пожаловать, " + editText.getText());
        //}

        //ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //textView = new TextView(this);
        //textView.setId(View.generateViewId());
        //ConstraintLayout.LayoutParams textViewLayout =  new ConstraintLayout.LayoutParams(
        //        ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.WRAP_CONTENT
        //);
        //textViewLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //textViewLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //textViewLayout.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        //textView.setLayoutParams(textViewLayout);
        //constraintLayout.addView(textView);

        //editText = new EditText(this);
        //editText.setId(View.generateViewId());
        //editText.setHint("Введите имя");
        //ConstraintLayout.LayoutParams editTextLayout =  new ConstraintLayout.LayoutParams(
        //        ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.WRAP_CONTENT
        //);
        //editTextLayout.topToBottom = textView.getId();
        //editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //editTextLayout.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        //editText.setLayoutParams(editTextLayout);
        //constraintLayout.addView(editText);

        //Button button = new Button(this);
        //button.setText("Ввод");
        //ConstraintLayout.LayoutParams buttonLayout =  new ConstraintLayout.LayoutParams(
        //        ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT
        //);
        //buttonLayout.topToBottom = editText.getId();
        //buttonLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //button.setLayoutParams(buttonLayout);
        //constraintLayout.addView(button);

        //button.setOnClickListener(new View.OnClickListener() {
        //    public void onClick(View v) {
        //        // Обработка нажатия
        //        textView.setText("Добро пожаловать, " + editText.getText());
        //    }
        //});

        //setContentView(constraintLayout);


        //}

        //public  void onClick(View view){
        //    Toast toast = Toast.makeText(this, "Hello Android!",Toast.LENGTH_LONG);
        //    toast.setGravity(Gravity.TOP, 0,160);   // import android.view.Gravity;
        //    toast.show();
        //}

        //}

        //public  void onClick(View view){
        //Snackbar snackbar = Snackbar.make(view, "Hello Android", Snackbar.LENGTH_LONG);

        //snackbar.setAction("Next...", new View.OnClickListener (){

        //    @Override
        //    public void onClick(View v) {
        //        Toast toast = Toast.makeText(getApplicationContext(), "Next clicked!",Toast.LENGTH_LONG);
        //        toast.show();
        //    }
        //});
        //snackbar.show();
        //snackbar.setTextColor(0XFF81C784);
        //snackbar.setBackgroundTint(0XFF555555);
        //snackbar.setActionTextColor(0XFF0277BD);


        //}

        //public void onCheckboxClicked(View view) {
        // Получаем флажок
        //CheckBox checkBox = (CheckBox) view;
        //TextView selection = findViewById(R.id.selection);
        // Получаем, отмечен ли данный флажок
        //if(checkBox.isChecked()) {
        //    selection.setText("Включено");
        //    checkBox.setText("Выключить");
        //}
        //else {
        //    selection.setText("Выключено");
        //    checkBox.setText("Включить");
        //}

        //}

        //public void onCheckboxClicked(View view) {
        // Получаем флажок
        //CheckBox checkBox = (CheckBox) view;
        // Получаем, отмечен ли данный флажок
        //boolean checked = checkBox.isChecked();

        //TextView selection = findViewById(R.id.selection);

        // Смотрим, какой именно из флажков отмечен
        //switch (view.getId()) {
        //    case R.id.java:
        //        if (checked)
        //            Toast.makeText(this, "Вы выбрали Java ", Toast.LENGTH_LONG).show();
        //        break;
        //    case R.id.kotlin:
        //        if (checked)
        //            Toast.makeText(this, "Вы выбрали Kotlin", Toast.LENGTH_LONG).show();
        //        break;
        //    default:
        //        selection.setText("");
        //}

        //public void onCheckboxClicked(View view) {
        // Получаем флажок
        //CheckBox language = (CheckBox) view;
        // Получаем, отмечен ли данный флажок
        //TextView selection = findViewById(R.id.selection);
        //if(language.isChecked())
        //    selection.setText(language.getText());
        //}

        //public void onCheckboxClicked(View view) {

        // Получаем флажки
        //CheckBox java = findViewById(R.id.java);
        //CheckBox kotlin = findViewById(R.id.kotlin);
        //String selectedItems = "";
        //if(java.isChecked())
        //    selectedItems +=java.getText() + " ";
        //if(kotlin.isChecked())
        //    selectedItems +=kotlin.getText();

        //TextView selection = findViewById(R.id.selection);
        //selection.setText(selectedItems);
        //}

        //TextView selection = findViewById(R.id.selection);
        //CheckBox enableBox = findViewById(R.id.enabled);

        //    enableBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        //    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        //        if(isChecked) {
        //            selection.setText("Включено");
        //            buttonView.setText("Выключить");
        //        }
        //        else {
        //           selection.setText("Выключено");
        //            buttonView.setText("Включить");
        //        }
        //        }
        //});

        //}

        //public void onToggleClicked(View view) {

        // включена ли кнопка
        //    boolean on = ((ToggleButton) view).isChecked();
        //    if (on) {
        //        // действия если включена
        //        Toast.makeText(this, "Свет включен", Toast.LENGTH_LONG).show();
        //    } else {
        //        // действия, если выключена
        //        Toast.makeText(this, "Свет выключен!", Toast.LENGTH_LONG).show();
        //    }

//        ConstraintLayout layout = new ConstraintLayout(this);
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        ToggleButton toggleButton = new ToggleButton(this);
//        toggleButton.setTextOff("Выключено");
//        toggleButton.setTextOn("Включено");
//        toggleButton.setText("Выключено");
//        toggleButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                boolean on = ((ToggleButton) view).isChecked();
//
//                if (on) {
//                    Toast.makeText(getApplicationContext(), "Свет включен", Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(), "Свет выключен!", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        layout.addView(toggleButton);
//        setContentView(layout);


//      // получаем объект RadioGroup
//        RadioGroup radGrp = (RadioGroup) findViewById(R.id.radios0);
//      // обработка переключения состояния переключателя
//        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup arg0, int id) {
//                TextView selection0 = findViewById(R.id.selection0);
//                switch (id) {
//                    case R.id.java0:
//                        selection0.setText("Выбрана Java");
//                        break;
//                    case R.id.kotlin0:
//                        selection0.setText("Выбран Kotlin");
//                        break;
//                    default:
//                        break;
//                }
//            }
//        });
//
//    }

//    public void onRadioButtonClicked(View view) {
//      // если переключатель отмечен
//        boolean checked = ((RadioButton) view).isChecked();
//        TextView selection = findViewById(R.id.selection);
//      // Получаем нажатый переключатель
//        switch (view.getId()) {
//            case R.id.java:
//                if (checked) {
//                    selection.setText("Выбрана Java");
//                }
//                break;
//            case R.id.kotlin:
//                if (checked) {
//                    selection.setText("Выбран Kotlin");
//                }
//                break;
//        }


//        TextView dateTextView = findViewById(R.id.dateTextView);
//        DatePicker datePicker = this.findViewById(R.id.datePicker);
//
//        // Месяц начиная с нуля. Для отображения добавляем 1.
//        datePicker.init(2023, 02, 06, new DatePicker.OnDateChangedListener() {
//            @Override
//            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//
//                // Отсчет месяцев начинается с нуля. Для отображения добавляем 1.
//                dateTextView.setText("Дата: " + view.getDayOfMonth() + "/" +
//                        (view.getMonth() + 1) + "/" + view.getYear());
//
//                // альтернативная запись
//                // dateTextView.setText("Дата: " + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
//            }
//        });
//
//        TextView dateTextView0 = findViewById(R.id.dateTextView0);
//        DatePicker datePicker0 = this.findViewById(R.id.datePicker0);
//
//        // Месяц начиная с нуля. Для отображения добавляем 1.
//        datePicker0.init(2023, 02, 06, new DatePicker.OnDateChangedListener() {
//            @Override
//            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//
//                // Отсчет месяцев начинается с нуля. Для отображения добавляем 1.
//                dateTextView0.setText("Дата: " + view.getDayOfMonth() + "/" +
//                        (view.getMonth() + 1) + "/" + view.getYear());
//
//                // альтернативная запись
//                // dateTextView.setText("Дата: " + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
//            }
//        });


//        TextView timeTextView = findViewById(R.id.timeTextView);
//        TimePicker timePicker = findViewById(R.id.timePicker);
//
//        // Установить формат времени на 24-часовой
//        timePicker.setIs24HourView(true);
//
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//
//                String NewHour = (hourOfDay < 10 ? "0" : "") + hourOfDay;
//                String NewMinute = (minute < 10 ? "0" : "") + minute;
//
//                timeTextView.setText("Время: " + NewHour + ":" + NewMinute);
//                // или так
//                // timeTextView.setText("Время: " + view.getHour() + ":" + view.getMinute());
//            }
//        });
//
//
//        TextView timeTextViewSpinner = findViewById(R.id.timeTextViewSpinner);
//        TimePicker timePickerSpinner = findViewById(R.id.timePickerSpinner);
//
//        // Установить формат времени на 24-часовой
//        timePickerSpinner.setIs24HourView(true);
//
//        timePickerSpinner.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//
//                String NewHour = (hourOfDay < 10 ? "0" : "") + hourOfDay;
//                String NewMinute = (minute < 10 ? "0" : "") + minute;
//
//                timeTextViewSpinner.setText("Время: " + NewHour + ":" + NewMinute);
//                // или так
//                // timeTextViewSpinner.setText("Время: " + view.getHour() + ":" + view.getMinute());
//            }
//        });


//        SeekBar seekBar = findViewById(R.id.seekBar);
//        TextView textView = findViewById(R.id.seekBarValue);
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//
//                textView.setText(String.valueOf(seekBar.getProgress()));
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });


//        //setContentView(R.layout.activity_main);
//        // получение ресурсов из файла values/strings.xml
//        String app_name = getResources().getString(R.string.app_name);
//
//        TextView textView = new TextView(this);
//        textView.setTextSize(30);
//        textView.setText(app_name);

//        Resources res = getResources();
//
//        String userName = "Даниил";
//        Calendar calendar = Calendar.getInstance();
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//        int minute = calendar.get(Calendar.MINUTE);
//
//        String text = getString(R.string.welcome_message, userName, hour, minute);
//        TextView textView = new TextView(this);
//        textView.setText(text);
//        textView.setTextSize(28);
//        setContentView(textView);

//        Locale locale = new Locale("rus");
//        Locale.setDefault(locale);
//        Configuration config = new Configuration();
//        config.locale = locale;
//        getBaseContext().getResources().updateConfiguration(
//                config, getBaseContext().getResources().getDisplayMetrics());
//
//        String rose = getResources().getQuantityString(R.plurals.flowers, 21, 21);
//
//        TextView textView = new TextView(this);
//        textView.setText(rose);
//        textView.setTextSize(26);
//        setContentView(textView);

//        Resources res = getResources();
//        String[] languages = res.getStringArray(R.array.languages);
//        String allLangs = "";
//        for (String lang: languages) {
//            allLangs += lang + " ";
//        }
//        TextView textView = new TextView(this);
//        textView.setText(allLangs);
//        textView.setTextSize(28);
//        setContentView(textView);


//        // получаем ресурсы
//        Resources resources = getResources();
//        float textSize = resources.getDimension(R.dimen.text_size);
//        int hMargin = (int)resources.getDimension(R.dimen.horizontal_margin);
//        int vMargin = (int)resources.getDimension(R.dimen.vertical_margin);
//
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//
//        TextView textView = new TextView(this);
//        textView.setText("Hello Android");
//        textView.setBackgroundColor(0XFFEAEAEA);
//        // устанавливаем размер шрифт по ресурсу
//        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
//        // устанавливаем отступы пв соответствии с ресурсами
//        layoutParams.setMargins(hMargin, vMargin, hMargin, vMargin);
//
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//
//        setContentView(constraintLayout);


//        // получаем ресурсы
//        Resources resources = getResources();
//        int textColor = resources.getColor(R.color.textViewFontColor,  null);
//        int backgroundColor = resources.getColor(R.color.textViewBackColor,  null);
//
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//
//        TextView textView = new TextView(this);
//        textView.setText("Hello Android");
//        textView.setTextSize(32);
//
//        // используем ресурсы color
//        textView.setTextColor(textColor);
//        textView.setBackgroundColor(backgroundColor);
//
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//
//        setContentView(constraintLayout);


//        Log.d(TAG, "onCreate");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(TAG, "onDestroy");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(TAG, "onStop");
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(TAG, "onStart");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d(TAG, "onPause");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d(TAG, "onResume");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d(TAG, "onRestart");
//    }


//    }
//    public void onClick(View view) {
//        Intent intent = new Intent(this, SecondActivity.class);
//        startActivity(intent);


//    }
//    public void onClick(View v) {
//
//        EditText nameText = findViewById(R.id.name);
//        EditText companyText = findViewById(R.id.company);
//        EditText ageText = findViewById(R.id.age);
//
//        String name = nameText.getText().toString();
//        String company = companyText.getText().toString();
//        int age = Integer.parseInt(ageText.getText().toString());
//
//        //Intent intent = new Intent(this, SecondActivity.class);
//        //intent.putExtra("name", name);
//        //intent.putExtra("company", company);
//        //intent.putExtra("age", age);
//        //startActivity(intent);
//
//        User user = new User(name, company, age);
//
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra(User.class.getSimpleName(), user);
//        startActivity(intent);


//    }
//    public void onClick(View v) {
//
//        EditText nameText = findViewById(R.id.name);
//        EditText companyText = findViewById(R.id.company);
//        EditText ageText = findViewById(R.id.age);
//
//        String name = nameText.getText().toString();
//        String company = companyText.getText().toString();
//        int age = Integer.parseInt(ageText.getText().toString());
//
//        User user = new User(name, company, age);
//
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra(User.class.getSimpleName(), user);
//        startActivity(intent);


//    }
//    public void onClick(View view) {
//        // получаем введенный возраст
//        EditText ageBox = findViewById(R.id.age);
//        String age = ageBox.getText().toString();
//
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra(AGE_KEY, age);
//
//        mStartForResult.launch(intent);


//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        ImageView imageView = new ImageView(this);
//        // применяем ресурс
//        imageView.setImageResource(R.drawable.dubi2);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        imageView.setLayoutParams(layoutParams);
//        constraintLayout.addView(imageView);
//
//        setContentView(constraintLayout);

//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        ImageView imageView = new ImageView(this);
//        Resources res = getResources();
//        Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.dubi2, null);
//        // применяем ресурс
//        imageView.setImageDrawable(drawable);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        imageView.setLayoutParams(layoutParams);
//        constraintLayout.addView(imageView);
//
//        setContentView(constraintLayout);


//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        ImageView imageView = new ImageView(this);
//        imageView.setImageResource(R.drawable.dubi2);
//        // задаем масштабирование
//        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        imageView.setLayoutParams(layoutParams);
//        constraintLayout.addView(imageView);
//
//        setContentView(constraintLayout);


//        ImageView imageView = findViewById(R.id.image) ;
//        String filename = "dubi2.png";
//        try(InputStream inputStream = getApplicationContext().getAssets().open(filename)){
//            Drawable drawable = Drawable.createFromStream(inputStream, null);
//            imageView.setImageDrawable(drawable);
//            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }


//        WebView browser=findViewById(R.id.webBrowser);
//        browser.loadUrl("https://metanit.com");
//    }


//        TextView contentView = findViewById(R.id.content);
//        WebView webView = findViewById(R.id.webView);
//        webView.getSettings().setJavaScriptEnabled(true);
//        Button btnFetch = findViewById(R.id.downloadBtn);
//        btnFetch.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                contentView.setText("Загрузка...");
//                new Thread(new Runnable() {
//                    public void run() {
//                        try{
//                            String content = getContent("https://stackoverflow.com/");
//                            webView.post(new Runnable() {
//                                public void run() {
//                                    webView.loadDataWithBaseURL("https://stackoverflow.com/",content, "text/html", "UTF-8", "https://stackoverflow.com/");
//                                    Toast.makeText(getApplicationContext(), "Данные загружены", Toast.LENGTH_SHORT).show();
//                                }
//                            });
//                            contentView.post(new Runnable() {
//                                public void run() {
//                                    contentView.setText(content);
//                                }
//                            });
//                        }
//                        catch (IOException ex){
//                            contentView.post(new Runnable() {
//                                public void run() {
//                                    contentView.setText("Ошибка: " + ex.getMessage());
//                                    Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_SHORT).show();
//                                }
//                            });
//                        }
//                    }
//                }).start();
//            }
//        });
//    }
//    private String getContent(String path) throws IOException {
//        BufferedReader reader=null;
//        InputStream stream = null;
//        HttpsURLConnection connection = null;
//        try {
//            URL url=new URL(path);
//            connection =(HttpsURLConnection)url.openConnection();
//            connection.setRequestMethod("GET");
//            connection.setReadTimeout(10000);
//            connection.connect();
//            stream = connection.getInputStream();
//            reader= new BufferedReader(new InputStreamReader(stream));
//            StringBuilder buf=new StringBuilder();
//            String line;
//            while ((line=reader.readLine()) != null) {
//                buf.append(line).append("\n");
//            }
//            return(buf.toString());
//        }
//        finally {
//            if (reader != null) {
//                reader.close();
//            }
//            if (stream != null) {
//                stream.close();
//            }
//            if (connection != null) {
//                connection.disconnect();
//            }
//        }
//    }


//        videoPlayer = findViewById(R.id.videoPlayer);
//        Uri myVideoUri= Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.cats);
//        videoPlayer.setVideoURI(myVideoUri);
//    }
//
//    public void play(View view){
//        videoPlayer.start();
//    }
//    public void pause(View view){
//        videoPlayer.pause();
//    }
//    public void stop(View view){
//        videoPlayer.stopPlayback();
//        videoPlayer.resume();
//    }

//        videoPlayer = findViewById(R.id.videoPlayer);
//        Uri myVideoUri= Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.cats);
//        videoPlayer.setVideoURI(myVideoUri);
//        MediaController mediaController = new MediaController(this);
//        videoPlayer.setMediaController(mediaController);
//        mediaController.setMediaPlayer(videoPlayer);
//    }
//
//    public void play(View view){
//        videoPlayer.start();
//    }
//    public void pause(View view){
//        videoPlayer.pause();
//    }
//    public void stop(View view){
//        videoPlayer.stopPlayback();
//        videoPlayer.resume();
//    }

//        videoPlayer = findViewById(R.id.videoPlayer);
//        videoPlayer.setVideoPath("http://techslides.com/demos/sample-videos/small.mp4");
//    }
//
//    public void play(View view){
//        videoPlayer.start();
//    }
//    public void pause(View view){
//        videoPlayer.pause();
//    }
//    public void stop(View view){
//        videoPlayer.stopPlayback();
//        videoPlayer.resume();
//    }


//        mPlayer= MediaPlayer.create(this, R.raw.music);
//        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                stopPlay();
//            }
//        });
//        playButton = findViewById(R.id.playButton);
//        pauseButton = findViewById(R.id.pauseButton);
//        stopButton = findViewById(R.id.stopButton);
//
//        pauseButton.setEnabled(false);
//        stopButton.setEnabled(false);
//    }
//    private void stopPlay(){
//        mPlayer.stop();
//        pauseButton.setEnabled(false);
//        stopButton.setEnabled(false);
//        try {
//            mPlayer.prepare();
//            mPlayer.seekTo(0);
//            playButton.setEnabled(true);
//        }
//        catch (Throwable t) {
//            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
//        }
//    }
//    public void play(View view){
//
//        mPlayer.start();
//        playButton.setEnabled(false);
//        pauseButton.setEnabled(true);
//        stopButton.setEnabled(true);
//    }
//    public void pause(View view){
//
//        mPlayer.pause();
//        playButton.setEnabled(true);
//        pauseButton.setEnabled(false);
//        stopButton.setEnabled(true);
//    }
//    public void stop(View view){
//        stopPlay();
//    }
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        if (mPlayer.isPlaying()) {
//            stopPlay();
//        }
//    }

//    mPlayer=MediaPlayer.create(this, R.raw.music);
//        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mp) {
//            stopPlay();
//        }
//    });
//    playButton = findViewById(R.id.playButton);
//    pauseButton = findViewById(R.id.pauseButton);
//    stopButton = findViewById(R.id.stopButton);
//
//    audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//    int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
//    int curValue = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
//
//    volumeControl = findViewById(R.id.volumeControl);
//        volumeControl.setMax(maxVolume);
//        volumeControl.setProgress(curValue);
//        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//        @Override
//        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//            audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
//        }
//        @Override
//        public void onStartTrackingTouch(SeekBar seekBar) {
//
//        }
//        @Override
//        public void onStopTrackingTouch(SeekBar seekBar) {
//
//        }
//    });
//
//        pauseButton.setEnabled(false);
//        stopButton.setEnabled(false);
//}
//    private void stopPlay(){
//        mPlayer.stop();
//        pauseButton.setEnabled(false);
//        stopButton.setEnabled(false);
//        try {
//            mPlayer.prepare();
//            mPlayer.seekTo(0);
//            playButton.setEnabled(true);
//        }
//        catch (Throwable t) {
//            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public void play(View view){
//
//        mPlayer.start();
//        playButton.setEnabled(false);
//        pauseButton.setEnabled(true);
//        stopButton.setEnabled(true);
//    }
//    public void pause(View view){
//
//        mPlayer.pause();
//        playButton.setEnabled(true);
//        pauseButton.setEnabled(false);
//        stopButton.setEnabled(true);
//    }
//    public void stop(View view){
//        stopPlay();
//    }
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        if (mPlayer.isPlaying()) {
//            stopPlay();
//        }
//    }

//        nameView = findViewById(R.id.nameView);
//    }
//
//    // сохранение состояния
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//
//        outState.putString(nameVariableKey, name);
//        super.onSaveInstanceState(outState);
//    }
//    // получение ранее сохраненного состояния
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//
//        name = savedInstanceState.getString(nameVariableKey);
//        nameView.setText(name);
//    }
//    public void saveName(View view) {
//
//        // получаем введенное имя
//        EditText nameBox = findViewById(R.id.nameBox);
//        //  сохраняем его в переменную name
//        name = nameBox.getText().toString();
//    }
//    public void getName(View view) {
//
//        //  выводим сохраненное имя
//        nameView.setText(name);
//    }


//    }
//
//    // сохранение состояния
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//
//        outState.putSerializable(userVariableKey, user);
//        super.onSaveInstanceState(outState);
//    }
//    // получение ранее сохраненного состояния
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        // получаем объект User в переменную
//        user = (User)savedInstanceState.getSerializable(userVariableKey);
//        TextView dataView = findViewById(R.id.dataView);
//        dataView.setText("Name: " + user.getName() + " Age: " + user.getAge());
//    }
//    public void saveData(View view) {
//
//        // получаем введенные данные
//        EditText nameBox = findViewById(R.id.nameBox);
//        EditText yearBox = findViewById(R.id.yearBox);
//        String name = nameBox.getText().toString();
//        int age = 0;  // значение по умолчанию, если пользователь ввел некорректные данные
//        try{
//            age = Integer.parseInt(yearBox.getText().toString());
//        }
//        catch (NumberFormatException ex){}
//        user = new User(name, age);
//    }
//    public void getData(View view) {
//
//        // получаем сохраненные данные
//        TextView dataView = findViewById(R.id.dataView);
//        dataView.setText("Name: " + user.getName() + " Age: " + user.getAge());
//    }


//        settings = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
//    }
//
//    public void saveName(View view) {
//        // получаем введенное имя
//        EditText nameBox = findViewById(R.id.nameBox);
//        String name = nameBox.getText().toString();
//        // сохраняем его в настройках
//        SharedPreferences.Editor prefEditor = settings.edit();
//        prefEditor.putString(PREF_NAME, name);
//        prefEditor.apply();
//    }
//
//    public void getName(View view) {
//        // получаем сохраненное имя
//        TextView nameView = findViewById(R.id.nameView);
//        String name = settings.getString(PREF_NAME,"не определено");
//        nameView.setText(name);
//    }

//        nameBox = findViewById(R.id.nameBox);
//        settings = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
//
//        // получаем настройки
//        String name = settings.getString(PREF_NAME,"");
//        nameBox.setText(name);
//    }
//
//    @Override
//    protected void onPause(){
//        super.onPause();
//
//        String name = nameBox.getText().toString();
//        // сохраняем в настройках
//        prefEditor = settings.edit();
//        prefEditor.putString(PREF_NAME, name);
//        prefEditor.apply();
//    }
//
//    public void saveName(View view) {
//
//    }
//
//    public void getName(View view) {
//
//    }


//        settingsText = findViewById(R.id.settingsText);
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
//        enabled = prefs.getBoolean("enabled", false);
//        login = prefs.getString("login", "не установлено");
//        settingsText.setText(login);
//        if(enabled)
//            settingsText.setVisibility(View.VISIBLE);
//        else
//            settingsText.setVisibility(View.INVISIBLE);
//    }
//
//    public void setPrefs(View view){
//        Intent intent = new Intent(this, SettingsActivity.class);
//        startActivity(intent);
//    }


//    }
//    // сохранение файла
//    public void saveText(View view){
//
//        FileOutputStream fos = null;
//        try {
//            EditText textBox = findViewById(R.id.editor);
//            String text = textBox.getText().toString();
//
//            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
//            fos.write(text.getBytes());
//            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
//        }
//        catch(IOException ex) {
//
//            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
//        }
//        finally{
//            try{
//                if(fos!=null)
//                    fos.close();
//            }
//            catch(IOException ex){
//
//                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
//    // открытие файла
//    public void openText(View view){
//
//        FileInputStream fin = null;
//        TextView textView = findViewById(R.id.text);
//        try {
//            fin = openFileInput(FILE_NAME);
//            byte[] bytes = new byte[fin.available()];
//            fin.read(bytes);
//            String text = new String (bytes);
//            textView.setText(text);
//        }
//        catch(IOException ex) {
//
//            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
//        }
//        finally{
//
//            try{
//                if(fin!=null)
//                    fin.close();
//            }
//            catch(IOException ex){
//
//                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        }
//    }


//    }
//    private File getExternalPath() {
//        return new File(getExternalFilesDir(null), FILE_NAME);
//    }
//    // сохранение файла
//    public void saveText(View view){
//
//        try(FileOutputStream fos = new FileOutputStream(getExternalPath())) {
//            EditText textBox = findViewById(R.id.editor);
//            String text = textBox.getText().toString();
//            fos.write(text.getBytes());
//            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
//        }
//        catch(IOException ex) {
//
//            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
//        }
//    }
//    // открытие файла
//    public void openText(View view){
//
//        TextView textView = findViewById(R.id.text);
//        File file = getExternalPath();
//        // если файл не существует, выход из метода
//        if(!file.exists()) return;
//        try(FileInputStream fin =  new FileInputStream(file)) {
//            byte[] bytes = new byte[fin.available()];
//            fin.read(bytes);
//            String text = new String (bytes);
//            textView.setText(text);
//        }
//        catch(IOException ex) {
//
//            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
//        }


//    }
//    public void onClick(View view){
//        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
//        db.execSQL("CREATE TABLE IF NOT EXISTS users (name TEXT, age INTEGER, UNIQUE(name))");
//        db.execSQL("INSERT OR IGNORE INTO users VALUES ('Tom Smith', 23), ('John Dow', 31);");
//
//        Cursor query = db.rawQuery("SELECT * FROM users;", null);
//        TextView textView = findViewById(R.id.textView);
//        textView.setText("");
//        while(query.moveToNext()){
//            String name = query.getString(0);
//            int age = query.getInt(1);
//            textView.append("Name: " + name + " Age: " + age + "\n");
//        }
//        query.close();
//        db.close();
//    }


//        header = findViewById(R.id.header);
//        userList = findViewById(R.id.list);
//
//        databaseHelper = new DatabaseHelper(getApplicationContext());
//    }
//    @Override
//    public void onResume() {
//        super.onResume();
//        // открываем подключение
//        db = databaseHelper.getReadableDatabase();
//
//        //получаем данные из бд в виде курсора
//        userCursor =  db.rawQuery("select * from "+ DatabaseHelper.TABLE, null);
//        // определяем, какие столбцы из курсора будут выводиться в ListView
//        String[] headers = new String[] {DatabaseHelper.COLUMN_NAME, DatabaseHelper.COLUMN_YEAR};
//        // создаем адаптер, передаем в него курсор
//        userAdapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item,
//                userCursor, headers, new int[]{android.R.id.text1, android.R.id.text2}, 0);
//        header.setText("Найдено элементов: " +  userCursor.getCount());
//        userList.setAdapter(userAdapter);
//    }
//
//    @Override
//    public void onDestroy(){
//        super.onDestroy();
//        // Закрываем подключение и курсор
//        db.close();
//        userCursor.close();
//    }


//    userList = findViewById(R.id.list);
//        userList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            Intent intent = new Intent(getApplicationContext(), UserActivity.class);
//            intent.putExtra("id", id);
//            startActivity(intent);
//        }
//    });
//
//    databaseHelper = new DatabaseHelper(getApplicationContext());
//}
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        // открываем подключение
//        db = databaseHelper.getReadableDatabase();
//
//        //получаем данные из бд в виде курсора
//        userCursor = db.rawQuery("select * from " + DatabaseHelper.TABLE, null);
//        // определяем, какие столбцы из курсора будут выводиться в ListView
//        String[] headers = new String[]{DatabaseHelper.COLUMN_NAME, DatabaseHelper.COLUMN_YEAR};
//        // создаем адаптер, передаем в него курсор
//        userAdapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item,
//                userCursor, headers, new int[]{android.R.id.text1, android.R.id.text2}, 0);
//        userList.setAdapter(userAdapter);
//    }
//
//    // по нажатию на кнопку запускаем UserActivity для добавления данных
//    public void add(View view) {
//        Intent intent = new Intent(this, UserActivity.class);
//        startActivity(intent);
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        // Закрываем подключение и курсор
//        db.close();
//        userCursor.close();
//    }


//        userList = findViewById(R.id.list);
//        userList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getApplicationContext(), UserActivity.class);
//                intent.putExtra("id", id);
//                startActivity(intent);
//            }
//        });
//
//        databaseHelper = new DatabaseHelper(getApplicationContext());
//        // создаем базу данных
//        databaseHelper.create_db();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        // открываем подключение
//        db = databaseHelper.open();
//        //получаем данные из бд в виде курсора
//        userCursor = db.rawQuery("select * from " + DatabaseHelper.TABLE, null);
//        // определяем, какие столбцы из курсора будут выводиться в ListView
//        String[] headers = new String[]{DatabaseHelper.COLUMN_NAME, DatabaseHelper.COLUMN_YEAR};
//        // создаем адаптер, передаем в него курсор
//        userAdapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item,
//                userCursor, headers, new int[]{android.R.id.text1, android.R.id.text2}, 0);
//        userList.setAdapter(userAdapter);
//    }
//
//    // по нажатию на кнопку запускаем UserActivity для добавления данных
//    public void add(View view) {
//        Intent intent = new Intent(this, UserActivity.class);
//        startActivity(intent);
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        // Закрываем подключение и курсор
//        db.close();
//        userCursor.close();
//    }


//        userList = (ListView)findViewById(R.id.userList);
//        userFilter = (EditText)findViewById(R.id.userFilter);
//
//        sqlHelper = new DatabaseHelper(getApplicationContext());
//        // создаем базу данных
//        sqlHelper.create_db();
//    }
//    @Override
//    public void onResume() {
//        super.onResume();
//        try {
//            db = sqlHelper.open();
//            userCursor = db.rawQuery("select * from " + DatabaseHelper.TABLE, null);
//            String[] headers = new String[]{DatabaseHelper.COLUMN_NAME, DatabaseHelper.COLUMN_YEAR};
//            userAdapter = new SimpleCursorAdapter(this, android.R.layout.two_line_list_item,
//                    userCursor, headers, new int[]{android.R.id.text1, android.R.id.text2}, 0);
//
//            // если в текстовом поле есть текст, выполняем фильтрацию
//            // данная проверка нужна при переходе от одной ориентации экрана к другой
//            AppCompatEditText userFilter;
//            if(!userFilter.getText().toString().isEmpty())
//                userAdapter.getFilter().filter(userFilter.getText().toString());
//
//            // установка слушателя изменения текста
//            userFilter.addTextChangedListener(new TextWatcher() {
//
//                public void afterTextChanged(Editable s) { }
//
//                public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
//                // при изменении текста выполняем фильтрацию
//                public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//                    userAdapter.getFilter().filter(s.toString());
//                }
//            });
//
//            // устанавливаем провайдер фильтрации
//            userAdapter.setFilterQueryProvider(new FilterQueryProvider() {
//                @Override
//                public Cursor runQuery(CharSequence constraint) {
//
//                    if (constraint == null || constraint.length() == 0) {
//
//                        return db.rawQuery("select * from " + DatabaseHelper.TABLE, null);
//                    }
//                    else {
//                        return db.rawQuery("select * from " + DatabaseHelper.TABLE + " where " +
//                                DatabaseHelper.COLUMN_NAME + " like ?", new String[]{"%" + constraint.toString() + "%"});
//                    }
//                }
//            });
//
//            userList.setAdapter(userAdapter);
//        }
//        catch (SQLException ex){}
//    }
//    @Override
//    public void onDestroy(){
//        super.onDestroy();
//        // Закрываем подключение и курсор
//        db.close();
//        userCursor.close();
//    }


//        userList = findViewById(R.id.list);
//
//        userList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                User user =arrayAdapter.getItem(position);
//                if(user!=null) {
//                    Intent intent = new Intent(getApplicationContext(), UserActivity.class);
//                    intent.putExtra("id", user.getId());
//                    startActivity(intent);
//                }
//            }
//        });
//    }
//
//     @Override
//     public void onResume() {
//         super.onResume();
//         DatabaseAdapter adapter = new DatabaseAdapter(this);
//         adapter.open();
//
//         List<User> users = adapter.getUsers();
//
//         arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, users);
//         userList.setAdapter(arrayAdapter);
//         adapter.close();
//     }
//     // по нажатию на кнопку запускаем UserActivity для добавления данных
//     public void add(View view){
//         Intent intent = new Intent(this, UserActivity.class);
//         startActivity(intent);
//     }


//  ViewPager2 pager = findViewById(R.id.pager);
//        FragmentStateAdapter pageAdapter = new MyAdapter(this);
//        pager.setAdapter(pageAdapter);
//    }


//        ViewPager2 pager = findViewById(R.id.pager);
//        FragmentStateAdapter pageAdapter = new MyAdapter(this);
//        pager.setAdapter(pageAdapter);
//
//        TabLayout tabLayout = findViewById(R.id.tab_layout);
//        TabLayoutMediator tabLayoutMediator= new TabLayoutMediator(tabLayout, pager, new TabLayoutMediator.TabConfigurationStrategy(){
//
//            @Override
//            public void onConfigureTab(TabLayout.Tab tab, int position) {
//                tab.setText("Страница " + (position + 1));
//            }
//        });
//        tabLayoutMediator.attach();
//    }


//    }
//
//    public void click(View v) {
//        Intent i = new Intent(this, MediaService.class);
//        if (v.getId() == R.id.start) {
//            startService(i);
//        } else {
//            stopService(i);
//
//        }
//    }


//        currentDateTime = findViewById(R.id.currentDateTime);
//        setInitialDateTime();
//    }
//
//    // отображаем диалоговое окно для выбора даты
//    public void setDate(View v) {
//        new DatePickerDialog(MainActivity.this, d,
//                dateAndTime.get(Calendar.YEAR),
//                dateAndTime.get(Calendar.MONTH),
//                dateAndTime.get(Calendar.DAY_OF_MONTH))
//                .show();
//    }
//
//    // отображаем диалоговое окно для выбора времени
//    public void setTime(View v) {
//        new TimePickerDialog(MainActivity.this, t,
//                dateAndTime.get(Calendar.HOUR_OF_DAY),
//                dateAndTime.get(Calendar.MINUTE), true)
//                .show();
//    }
//    // установка начальных даты и времени
//    private void setInitialDateTime() {
//
//        currentDateTime.setText(DateUtils.formatDateTime(this,
//                dateAndTime.getTimeInMillis(),
//                DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR
//                        | DateUtils.FORMAT_SHOW_TIME));
//    }
//
//    // установка обработчика выбора времени
//    TimePickerDialog.OnTimeSetListener t=new TimePickerDialog.OnTimeSetListener() {
//        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//            dateAndTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
//            dateAndTime.set(Calendar.MINUTE, minute);
//            setInitialDateTime();
//        }
//    };
//
//    // установка обработчика выбора даты
//    DatePickerDialog.OnDateSetListener d=new DatePickerDialog.OnDateSetListener() {
//        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//            dateAndTime.set(Calendar.YEAR, year);
//            dateAndTime.set(Calendar.MONTH, monthOfYear);
//            dateAndTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);
//            setInitialDateTime();
//        }
//    };


//    }
//
//    public void showDialog(View v) {
//
//        CustomDialogFragment dialog = new CustomDialogFragment();
//        dialog.show(getSupportFragmentManager(), "custom");
//    }


//        ListView phonesList = findViewById(R.id.phonesList);
//        ArrayList<String> phones = new ArrayList<>();
//        phones.add("Google Pixel");
//        phones.add("Huawei P9");
//        phones.add("LG G5");
//        phones.add("Samsung Galaxy S8");

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, phones);
//        phonesList.setAdapter(adapter);
//
//        phonesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                String selectedPhone = adapter.getItem(position);
//                CustomDialogFragment dialog = new CustomDialogFragment();
//                Bundle args = new Bundle();
//                args.putString("phone", selectedPhone);
//                dialog.setArguments(args);
//                dialog.show(getSupportFragmentManager(), "custom");
//            }
//        });
//    }

//        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, phones);
//        phonesList.setAdapter(adapter);
//
//        phonesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                String selectedPhone = adapter.getItem(position);
//                CustomDialogFragment dialog = new CustomDialogFragment();
//                Bundle args = new Bundle();
//                args.putString("phone", selectedPhone);
//                dialog.setArguments(args);
//                dialog.show(getSupportFragmentManager(), "custom");
//            }
//        });
//    }
//    @Override
//    public void remove(String name) {
//        adapter.remove(name);
//    }


//        ImageView img = findViewById(R.id.animationView);
//        // устанавливаем ресурс анимации
//        img.setBackgroundResource(R.drawable.animation);
//        // получаем объект анимации
//        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
//        // по нажатию на ImageView
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // запускаем анимацию
//                frameAnimation.start();
//            }
//        });
//    }


//        ImageView img = findViewById(R.id.animationView);
//        // определим для ImageView какое-нибудь изображение
//        img.setImageResource(R.drawable.dubi2);
//        // создаем анимацию
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.common_animation);
//        // запуск анимации
//        img.startAnimation(animation);
//    }


//        // получаем разрешения
//        int hasReadContactPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS);
//        // если устройство до API 23, устанавливаем разрешение
//        if(hasReadContactPermission == PackageManager.PERMISSION_GRANTED){
//            READ_CONTACTS_GRANTED = true;
//        }
//        else{
//            // вызываем диалоговое окно для установки разрешений
//            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_CONTACTS}, REQUEST_CODE_READ_CONTACTS);
//        }
//        // если разрешение установлено, загружаем контакты
//        if (READ_CONTACTS_GRANTED){
//            loadContacts();
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults){
//
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//
//        if (requestCode == REQUEST_CODE_READ_CONTACTS) {
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                READ_CONTACTS_GRANTED = true;
//            }
//        }
//        if(READ_CONTACTS_GRANTED){
//            loadContacts();
//        }
//        else{
//            Toast.makeText(this, "Требуется установить разрешения", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    private void loadContacts(){
//        ContentResolver contentResolver = getContentResolver();
//        Cursor cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
//        ArrayList<String> contacts = new ArrayList<String>();
//
//        if(cursor!=null){
//            while (cursor.moveToNext()) {
//
//                // получаем каждый контакт
//                String contact = cursor.getString(
//                        cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME_PRIMARY));
//                // добавляем контакт в список
//                contacts.add(contact);
//            }
//            cursor.close();
//        }
//
//        // создаем адаптер
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1, contacts);
//
//        ListView contactList = findViewById(R.id.contactList);
//        // устанавливаем для списка адаптер
//        contactList.setAdapter(adapter);
//    }


//        addBtn = findViewById(R.id.addBtn);
//        // получаем разрешения
//        int hasReadContactPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS);
//        // если устройство до API 23, устанавливаем разрешение
//        if(hasReadContactPermission == PackageManager.PERMISSION_GRANTED){
//            READ_CONTACTS_GRANTED = true;
//        }
//        else{
//            // вызываем диалоговое окно для установки разрешений
//            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_CONTACTS, Manifest.permission.WRITE_CONTACTS}, REQUEST_CODE_READ_CONTACTS);
//        }
//        // если разрешение установлено, загружаем контакты
//        if (READ_CONTACTS_GRANTED){
//            loadContacts();
//        }
//
//        addBtn.setEnabled(READ_CONTACTS_GRANTED);
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
//
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//
//        if (requestCode == REQUEST_CODE_READ_CONTACTS) {
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                READ_CONTACTS_GRANTED = true;
//            }
//            addBtn.setEnabled(READ_CONTACTS_GRANTED);
//        }
//        if(READ_CONTACTS_GRANTED){
//            loadContacts();
//        }
//        else{
//            Toast.makeText(this, "Требуется установить разрешения", Toast.LENGTH_LONG).show();
//        }
//    }
//    public void onAddContact(View v) {
//        ContentValues contactValues = new ContentValues();
//        EditText contactText = findViewById(R.id.newContact);
//        String newContact = contactText.getText().toString();
//        contactText.setText("");
//        contactValues.put(ContactsContract.RawContacts.ACCOUNT_NAME, newContact);
//        contactValues.put(ContactsContract.RawContacts.ACCOUNT_TYPE, newContact);
//        Uri newUri = getContentResolver().insert(ContactsContract.RawContacts.CONTENT_URI, contactValues);
//        long rawContactsId = ContentUris.parseId(newUri);
//        contactValues.clear();
//        contactValues.put(ContactsContract.Data.RAW_CONTACT_ID, rawContactsId);
//        contactValues.put(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE);
//        contactValues.put(ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME, newContact);
//        getContentResolver().insert(ContactsContract.Data.CONTENT_URI, contactValues);
//        Toast.makeText(getApplicationContext(), newContact + " добавлен в список контактов", Toast.LENGTH_LONG).show();
//        loadContacts();
//    }
//    private void loadContacts(){
//        contacts.clear();
//        ContentResolver contentResolver = getContentResolver();
//        Cursor cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
//        if(cursor!=null){
//            while (cursor.moveToNext()) {
//
//                // получаем каждый контакт
//                String contact = cursor.getString(
//                        cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME_PRIMARY));
//                // добавляем контакт в список
//                contacts.add(contact);
//            }
//            cursor.close();
//        }
//        // создаем адаптер
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_list_item_1, contacts);
//        // устанавливаем для списка адаптер
//        ListView contactList = findViewById(R.id.contactList);
//        contactList.setAdapter(adapter);
//    }


    }
    // получение всех
    public void getAll(View view){
        String[] projection = {
                FriendsContract.Columns._ID,
                FriendsContract.Columns.NAME,
                FriendsContract.Columns.EMAIL,
                FriendsContract.Columns.PHONE
        };
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(FriendsContract.CONTENT_URI,
                projection,
                null,
                null,
                FriendsContract.Columns.NAME);
        if(cursor != null){
            Log.d(TAG, "count: " + cursor.getCount());
            // перебор элементов
            while(cursor.moveToNext()){
                for(int i=0; i < cursor.getColumnCount(); i++){
                    Log.d(TAG, cursor.getColumnName(i) + " : " + cursor.getString(i));
                }
                Log.d(TAG, "=========================");
            }
            cursor.close();
        }
        else{
            Log.d(TAG, "Cursor is null");
        }
    }
    // Добавление
    public void add(View view){
        ContentResolver contentResolver = getContentResolver();
        ContentValues values = new ContentValues();
        values.put(FriendsContract.Columns.NAME, "Sam");
        values.put(FriendsContract.Columns.EMAIL, "sam@gmail.com");
        values.put(FriendsContract.Columns.PHONE, "+13676254985");
        Uri uri = contentResolver.insert(FriendsContract.CONTENT_URI, values);
        Log.d(TAG, "Friend added");
    }

    // Обновление
    public void update(View view){
        ContentResolver contentResolver = getContentResolver();
        ContentValues values = new ContentValues();
        values.put(FriendsContract.Columns.EMAIL, "sammy@gmail.com");
        values.put(FriendsContract.Columns.PHONE, "+55555555555");
        String selection = FriendsContract.Columns.NAME + " = 'Sam'";
        int count = contentResolver.update(FriendsContract.CONTENT_URI, values, selection, null);
        Log.d(TAG, "Friend updated");
    }
    // Удаление
    public void delete(View view){
        ContentResolver contentResolver = getContentResolver();
        String selection = FriendsContract.Columns.NAME + " = ?";
        String[] args = {"Sam"};
        int count = contentResolver.delete(FriendsContract.CONTENT_URI, selection, args);
        Log.d(TAG, "Friend deleted");
    }
}