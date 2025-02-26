package com.keygun2001.providers;

public abstract class ServiceProvider {
    /**
     * Register any application service
     *
     * @return void
     */
    public abstract void register();


    /**
     * Bootstrap any application service
     * this should be called after all services are registered
     *
     * @return void
     */
    public abstract void boot();
}
