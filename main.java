public class CatalogActivity extends AppCompatActivity {

	  @Override	  protected void onCreate(Bundle savedInstanceState) {	super.onCreate(savedInstanceState);	setContentView(R.layout.activity_catalog);

				  // find the ListView jo populate kru pet data

				  ListView petListView = (ListView)findViewById(R.id.list);

		//find & set empty view on ListView, so that it only show when the list has 0 item

		          View emptyView = findViewById(R.id.empty_view);		  petListView.setEmptyView(emptyView);

	  }
