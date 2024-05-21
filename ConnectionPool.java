class ConnectionPool {
    private static final String JDBC_URL = "jdbc:mysql://localhost:4306/bankcommand";
    private static final String USERNAME = "samer";
    private static final String PASSWORD = "mmm";
    private static final int MAX_TOTAL_CONNECTIONS = 10;

    private static BasicDataSource dataSource;


    static {
        dataSource = new BasicDataSource();
        dataSource.setUrl(JDBC_URL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
        dataSource.setMaxTotal(MAX_TOTAL_CONNECTIONS);
    }


    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }