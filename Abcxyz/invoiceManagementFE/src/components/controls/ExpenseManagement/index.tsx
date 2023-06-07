import React, { useEffect, useState } from 'react';
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import HomeServices from '../../../services/API/home.service';


const Expense = () => {
  const [data, setData] = useState<any>({});

  useEffect(() => {
    const fetchData = async () => {
      const result = await HomeServices.findAll();
      setData(result);
    };
    fetchData();
  }, []);

  if (!data) {
    return <div>Loading...</div>;
  }
  
  return (
    <div className="card">
      <DataTable value={data}>
        <Column field="id" header="id"></Column>
        <Column field="content" header="content"></Column>
        <Column field="createdAt" header="createdAt"></Column>
    </DataTable>
    </div>
  );
}

export default Expense;