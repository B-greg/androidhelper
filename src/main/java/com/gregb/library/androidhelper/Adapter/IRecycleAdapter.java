package com.gregb.library.androidhelper.Adapter;

import java.util.Collection;
import java.util.List;

/**
 * Created by gregoire on 11/11/14.
 */
public interface IRecycleAdapter<T> {

  /**
   * Get item at position
   *
   * @param position position on the list
   * @return items at the position
   */
  Object getItem(int position);

  /**
   * Get all items
   *
   * @return all items
   */
  List<T> getItems();

  /**
   * Add new items to le current list
   *
   * @param items New items.
   */
  void appendItems(Collection<T> items);

  /**
   * Add mew item
   *
   * @param item mew item
   */
  void appendItem(T item);

  /**
   * append items and clean old list
   *
   * @param items new items
   */
  void appendNewsItems(Collection<T> items);

  /**
   * Clean the item list
   */
  void clear();

  /**
   * Delete item at the specific position.
   *
   * @param position position to delete the item.
   */
  void deleteItem(int position);

  /**
   * Add item a the specific position.
   *
   * @param position position to add the item.
   * @param item item to add.
   */
  void addItem(int position, T item);
}
