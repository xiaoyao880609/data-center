package net.chinaedu.datacenterservice.service.asyncexecutor.imp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import net.chinaedu.datacenterservice.service.asyncexecutor.IAsyncExecutor;

@Service
public class AsyncExecutor implements IAsyncExecutor {
	private static final Logger logger = LoggerFactory.getLogger(AsyncExecutor.class);
    private ExecutorService      taskExecutor   = new ThreadPoolExecutor(10, 100, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(7000));


    @Override
    public void test() {
        taskExecutor.execute(() -> {
            System.out.println("To do things...");
        });
    }
}